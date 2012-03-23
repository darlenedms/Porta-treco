class Funcionario {
	String nome, departamento, rg;
	double salario;
	Data dataEntrada;


	void bonifica(double aumento) {
		this.salario += aumento;	
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	void mostra() {

		System.out.print("O funcionário " + this.nome);
		System.out.print(", de RG " + this.rg);
		System.out.print(", trabalha no departamento " + this.departamento);
		//System.out.print(" desde o dia " + this.dataEntrada);
		System.out.print(". Atualmente o salário dele é de R$ " + this.salario);
		System.out.println(", resultando em uma ganho anual de R$: " + this.calculaGanhoAnual());

		System.out.println("Dia: " + this.dataEntrada.dia);
		System.out.println("Mês: " + this.dataEntrada.mes);
		System.out.println("Ano: " + this.dataEntrada.ano);

	}
}
