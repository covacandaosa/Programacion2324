package herencia.ejercicio6;

import clases.ejercicio5.Palo;
import clases.ejercicio5.Rango;
import clases.ejercicio6.Mazo;

public class MazoBJ extends Mazo {
	
	public MazoBJ(int n) {
		for (int i=0; i<n; i++)
			for (Palo p: Palo.values())
				for (Rango r: Rango.values())
					add(new NaipeBJ(p, r));
	}
}
