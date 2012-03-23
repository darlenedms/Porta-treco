class Empresa {
	int posicao = 0;	// Não é necessário colocar igual a zero pois o default de int já é zero
	String nome, cnpj;
	Funcionario[] empregados;	// Não coloquei um número fixo de funcionários para ficar mais flexível

/*
	void adiciona(Funcionario f) {
		this.empregados[posicao] = f;
		posicao++;	
		// Também é possível colocar simplesmente this.empregados[posicao++] = f;
		// pois ele só vai incrementar depois de adicionar o funcionário ao array
	}
*/

	//	Atualmente, se você tentar adicionar mais funcionários do que o array suporta, vai dar erro,
	//	por isso faremos da seguinte forma:

	void adiciona(Funcionario f) {
		if (posicao == empregados.length) {	// Verifica se a posição é igual ao array
			Funcionario[] temp = new Funcionario[posicao * 2];	// Cria um array temporário
			for (int i = 0; i < empregados.length; i++) {
				temp[i] = empregados[i];	// Passa os valores pro array temporário
			}
			empregados = temp;	// Faz a variável empregados referenciar o novo array (temp)
		}
		this.empregados[posicao++] = f;	// Finalmente adiciona o funcionário	
	}









	// O array não está completo, por isso precisamos mostrar apenas os funcionários que estão no array
/*	void mostraEmpregados() {
		for (int i = 0; i < this.empregados.length; i++) {
			if (empregados[i] != null) {
				System.out.print("O funcionário na posição: " + i);
				System.out.println(" possui o salário de R$ : " + empregados[i].salario);
			}
		}
	}

	// Ou podemos fazer de forma mais eficiente:
*/
	// Aproveitamos que a variável posicao já guarda o limite de funcionários inseridos no array
	void mostraEmpregados() {
		for (int i = 0; i < posicao; i++) {	
			System.out.print("O funcionário na posição: " + i);
			System.out.println(" possui o salário de R$ : " + empregados[i].salario);
		}
	}

	
	boolean contem(Funcionario f) {
		for (int i = 0; i < posicao; i++) {
			if (f == empregados[i]) {
				return true;				
			}
		}
		return false;	
	}
}
