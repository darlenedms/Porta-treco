class TestaFuncionario {
	public static void main(String[] args) {

		// Funcionário 1
		Funcionario f1 = new Funcionario("Fiodor");
		
		System.out.println("Funcionário 1");
		System.out.println("Salário Atual: " + f1.getSalario());
		f1.setAumento(50);
		System.out.println("Salário com aumento: " + f1.getSalario());
		System.out.println("Ganho Anual: " + f1.getGanhoAnual() + "\n");

		// Funcionário 2
		Funcionario f2 = new Funcionario();

		System.out.println("Funcionário 2");
		f2.setNome("Alberto");
		f2.getSalario();
		f2.setAumento(0.50);
		f2.setDepartamento("comercial");
		f2.setRg("12345");

		f2.getFuncionario();
	

		// Funcionário 3
		Funcionario f3 = new Funcionario("Josefa");
		System.out.println("\nFuncionário 3");
		System.out.println("O identificador desse funcionário é: " + f3.getIdentificador());

		System.out.println("\nA empresa possui " + Funcionario.getFuncionarios() + " funcionários.");
	}
}
