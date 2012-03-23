class TestaEmpresa {
	
	public static void main(String[] args) {
		Data data;	// Vamos utilizar um objeto Data
	
	//	Cria um objeto Empresa, que possui nome, cnpj e um array de funcionários
		Empresa empresa = new Empresa();


	//	Cria os objetos do tipo Funcionário
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		Funcionario f4 = new Funcionario();


	//	Define os atributos dos funcionários

		//Funcionário 1
		f1.nome = "Alberto";
		f1.departamento = "comercial";
		f1.rg = "123";
		f1.salario = 2500.0;
		data = new Data();
		data.dia = 14;
		data.mes = 3;
		data.ano = 2005;
		f1.dataEntrada = data;

		//Funcionário 2
		f2.nome = "Bernardo";
		f2.departamento = "rh";
		f2.rg = "456";
		f2.salario = 1950.0;
		data = new Data();
		data.dia = 8;
		data.mes = 7;
		data.ano = 2003;
		f2.dataEntrada = data;

		//Funcionário 3
		f3.nome = "Caio";
		f3.departamento = "comercial";
		f3.rg = "789";
		f3.salario = 2100.0;
		data = new Data();
		data.dia = 11;
		data.mes = 5;
		data.ano = 2010;
		f3.dataEntrada = data;

		//Funcionário 4
		f4.nome = "Diogo";
		f4.departamento = "comercial";
		f4.rg = "321";
		f4.salario = 1500.0;
		data = new Data();
		data.dia = 23;
		data.mes = 8;
		data.ano = 2003;
		f4.dataEntrada = data;


	//	Cria um array de 10 posicoes
		empresa.empregados = new Funcionario[2];


	//	Envia as informações dos funcionários para o 
	//	o método adiciona da classe Empresa
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		empresa.adiciona(f3); 

		
	//	Exibe os funcionários
		empresa.mostraEmpregados();


/*
	//	Para agilizar o processo podemos utilizar um for para criar os funcionários

		for (int i = 0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.nome = "funcionariofofo " + i;
			f.salario = 1000 + (i * 100);		
		}
*/


	//	Para verificar se um funcionário já está no array
		if (empresa.contem(f4)) {
			System.out.println("O funcionário " + f4.nome + " já pertence ao array.");
		} else {
			System.out.println("O funcionário " + f4.nome + " NÃO pertence ao array.");
		}

	}
}
