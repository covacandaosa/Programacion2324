package naipes;

public class Naipe {
	
	private Palo palo;
	private Rango rango;
	
	public Naipe(Palo palo, Rango rango, int valor) {
		this.palo = palo;
		this.rango = rango;
	}
	
	public Naipe(Palo palo, Rango rango) {
		this.palo = palo;
		this.rango = rango;
	}
	
	@Override
	public String toString() {
		return rango.toString() + palo.toString();
	}

	public Palo getPalo() {
		return palo;
	}

	public Rango getRango() {
		return rango;
	}

	public int getValor() {
		return rango.ordinal() + 1;
	}
	
}
