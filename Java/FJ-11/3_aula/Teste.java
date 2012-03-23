class Teste {
	public static void main(String[] args) {
		Func[] funcionarios = new Func[2];
		Func f1 = new Func();
		f1.salario = 2000.0;
		funcionarios[0] = f1;
		Func f2 = new Func();
		f2.salario = 3000.0;
		funcionarios[1] = f2;

		for (int i = 0; i < 2; i++) {
			System.out.println(funcionarios[i].salario);
		} 
	}
}
