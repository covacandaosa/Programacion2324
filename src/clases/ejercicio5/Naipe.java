package clases.ejercicio5;

import java.util.Objects;

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
		return rango.toString() + palo.toString();
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

	@Override
	public int hashCode() {
		return Objects.hash(palo, rango, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Naipe other = (Naipe) obj;
		return palo == other.palo && rango == other.rango && valor == other.valor;
	}
	
	
	
}
