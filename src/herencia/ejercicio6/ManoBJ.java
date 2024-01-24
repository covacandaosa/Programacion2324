package herencia.ejercicio6;

import clases.ejercicio5.Naipe;
import clases.ejercicio5.Rango;
import clases.ejercicio6.Mazo;

public class ManoBJ extends Mazo {

	private int valor;
	
	public ManoBJ() {
		super(0);
	}

	public int getValor() {
		return valor;
	}

	@Override
	public void add(Naipe naipe) {
		super.add(naipe);
		int ases = 0;
		for (Naipe n: getNaipes()) {
			valor += n.getValor();
			if (n.getRango() == Rango.ACE)
				ases++;
		}
		while (valor > 21 && ases > 0) {
			valor -= 9;
			ases--;
		}
	}
	
}
