class BalancoTrimestral {
	public static void main(String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre/3;

		System.out.println("Os gastos do trimestre resultaram em R$ " + gastosTrimestre + ",00.");
		System.out.println("Valor da média mensal é R$ " + mediaMensal + ",00.");
	}
}
