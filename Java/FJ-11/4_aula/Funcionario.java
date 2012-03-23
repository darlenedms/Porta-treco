class Funcionario {
	private String nome;
	private String departamento;
	private String rg;
	private double salario = 1000;
	private static int numFuncionarios;
	private static int identificador = 1;
	private int id;

/* Se você criar getters e setters para todos os atributos da sua classe, porque eles são privados então? 
Afinal, a idéia do private é encapsular as informações para que o mundo externo não possa acessar. Entretanto,
o ideal é que todos os atributos sejam privados. */


/*----------------------*/
/*	Construtor	*/
/*----------------------*/
	public Funcionario(String nome) {
		this.nome = nome;
		numFuncionarios++;
		this.id = Funcionario.identificador;
		identificador++;
	}

	public Funcionario() {
		numFuncionarios++;
		this.id = Funcionario.identificador;
		identificador++;
	}


	// Funcionários
	public static int getFuncionarios() {
		return numFuncionarios;
	}


/*----------------------*/
/*	Instâncias	*/
/*----------------------*/

	// Funcionário
	public void getFuncionario() {
		System.out.print("O funcionário " + this.nome);
		System.out.print(", de RG " + this.rg);
		System.out.print(", trabalha no departamento " + this.departamento);
		System.out.print(". Atualmente o salário dele é de R$ " + this.salario);
		System.out.println(", resultando em uma ganho anual de R$: " + this.getGanhoAnual());
	}	
	

	public int getIdentificador() {
		return this.id;
	}

	// Nome
	public void setNome (String n) {
		this.nome = n;
	}

	public String getNome () {
		return this.nome;		
	}


	// RG
	public void setRg (String rg) {
		this.rg = rg;
	}

	public String getRG () {
		return this.rg;
	}


	// Salário
	public double getSalario () {
		return this.salario;
	}

	public double getGanhoAnual() {
		return this.salario * 12;
	}

	public void setAumento(double aumento) {
		this.salario += aumento;	
	}

	// Departamento
	public void setDepartamento (String d) {
		this.departamento = d;
	}

	public String getDepartamento () {
		return this.departamento;
	}

}
