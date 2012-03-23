class Exercicio5 {
	public static void main(String[] args) {
		for (long n = 1, fatorial = 1; n <= 40; n++) {
			System.out.println("Fatorial de " + n + " = " + n*fatorial);
			fatorial = n*fatorial;
		}
	}
}
