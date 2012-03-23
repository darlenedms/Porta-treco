class Exercicio4 {
	public static void main(String[] args) {
		for (int n = 1, fatorial = 1; n <= 10; n++) {
			System.out.println("Fatorial de " + n + " = " + n*fatorial);
			fatorial = n*fatorial;
		}
	}
}
