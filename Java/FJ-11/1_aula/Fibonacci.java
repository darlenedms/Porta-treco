class Fibonacci {
	public static void main(String[] args) {
		int i = 0, j = 1;

		while (i < 100) {
			
			System.out.print(i + " ");			
			j = i + j;			
			i = j - i;	
		}
	}
}
