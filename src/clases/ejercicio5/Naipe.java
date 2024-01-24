package clases.ejercicio5;

public class Naipe {
	
	private Palo palo;
	private Rango rango;
	private int valor;
	
	public Naipe(Palo palo, Rango rango, int valor) {
		this.palo = palo;
		this.rango = rango;
		this.valor = valor;
	}
	
	public Naipe(Palo palo, Rango rango) {
		this.palo = palo;
		this.rango = rango;
		this.valor = rango.ordinal() + 1;
	}
	
	@Override
	public String toString() {
		return rango.toString() + palo.toString() + "(" + valor + ")";
	}

	public Palo getPalo() {
		return palo;
	}

	public Rango getRango() {
		return rango;
	}

	public int getValor() {
		return valor;
	}
	
	
	
}
