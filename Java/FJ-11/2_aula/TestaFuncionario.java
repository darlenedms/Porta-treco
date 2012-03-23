class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = "Fiodor";
		f1.salario = 100;
		f1.bonifica(50);
		//f1.dataEntrada = "12/06/1997";

		System.out.println("Salário Atual: " + f1.salario);
		System.out.println("Ganho Anual: " + f1.calculaGanhoAnual());

		Data data = new Data();
		f1.dataEntrada = data;

		f1.mostra();

/*	VERIFICA SE SÃO IGUAIS

	//	Funcionario 2
	//-----------------------------
		Funcionario f2 = new Funcionario();  //diferentes

		f2.nome = "Fiodor";
		f2.salario = 100;
		f2.bonifica(50);
		f2.dataEntrada = "12/06/1997";

		//System.out.println("Salário Atual: " + f2.salario);
		//System.out.println("Ganho Anual: " + f2.calculaGanhoAnual());

		//f2.mostra();
		
	//-----------------------------
		f2 = f1;  //iguais

	//	Checa se são iguais
		if (f1 == f2) {
			System.out.println("Iguais");		
		} else {
			System.out.println("Diferentes");
		}
*/

	}
}
