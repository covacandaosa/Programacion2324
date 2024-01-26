package herencia.ejercicio6;

import clases.ejercicio5.Naipe;
import clases.ejercicio5.Rango;
import clases.ejercicio6.Mazo;

public class ManoBJ extends Mazo {

	private int valor;
	private int ases;
	
	public ManoBJ() {
		super(0);
	}

	public int getValor() {
		return valor;
	}

	@Override
	public void add(Naipe naipe) {
		super.add(naipe);
		valor += naipe.getValor();
		if (naipe.getRango() == Rango.ACE)
			ases++;
		while (valor > 21 && ases > 0) {
			valor -= 10;
			ases--;
		}
	}
	
}
