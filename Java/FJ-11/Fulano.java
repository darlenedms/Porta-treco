class Fulano {

	
	
	public static void main(String[] args) {
		String[] surpresa = new String[5];
		surpresa[0] = " é inteligente";
		surpresa[1] = " está feliz";
		surpresa[2] = " está com sono";
		surpresa[3] = " quer ir embora";
		surpresa[4] = " sabe calcular desconto";

		int soma;
		for (int i = 0; i < args.length; i++) {
			soma = 0;
			for (int j = 0; j < args[i].length(); j++) {
				soma += (int) args[i].charAt(j);
			}
			System.out.println("\n" + args[i] + surpresa[soma % 5]);
		}
		System.out.println("\n");
	}


}
