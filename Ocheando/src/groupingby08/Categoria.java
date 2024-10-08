package groupingby08;

public enum Categoria {
	novel(.75f), senior(1f), experto(1.5f);
	
	float factorSaldo;

	private Categoria(float factorSaldo) {
		this.factorSaldo = factorSaldo;
	}

	public float getFactorSaldo() {
		return factorSaldo;
	}
	
	
}
