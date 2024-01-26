package herencia.ejercicio6;

import clases.ejercicio5.Naipe;
import clases.ejercicio5.Rango;
import clases.ejercicio6.Mazo2;

public class ManoBJ2 extends Mazo2 {

	private int valor;
	private int ases;
	
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
