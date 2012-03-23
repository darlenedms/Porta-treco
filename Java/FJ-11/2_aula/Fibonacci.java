class Fibonacci {
	Fibonacci fibo = new Fibonacci();
	int i = fibo.calculaFibonacci(6);

	int calculaFibonacci(int i) {
		int j = 1;
	
		System.out.print(i + " ");			
		j = i + j;			
		i = j - i;	

	}
}
