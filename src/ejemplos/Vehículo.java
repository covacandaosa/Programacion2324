package ejemplos;

public class Vehículo {
	
	private int ruedas;
	private int potencia;
	private int plazas;
	
	public Vehículo(int ruedas, int potencia, int plazas) {
		super();
		this.ruedas = ruedas;
		this.potencia = potencia;
		this.plazas = plazas;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getPotencia() {
		return potencia;
	}

	public int getPlazas() {
		return plazas;
	}

}
