class ExercicioCasting {
	public static void main(String[] args) {
		double pi = 3.14;
		//int outroPi = 3.14;
		char b = 'b';
		int letraB = b;

		System.out.println(letraB);

		char deVoltaAoB = (char)letraB;
		System.out.println(deVoltaAoB);

		int anoDaCopa = 2014;
		double copaNoBrasil = anoDaCopa;
		System.out.println(copaNoBrasil);

		float anoDaCopaFloat = (float)copaNoBrasil;
		
		float outroPi = 3.14f;
		System.out.println(outroPi); 
	}
}
