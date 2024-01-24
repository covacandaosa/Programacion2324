package herencia.ejercicio6;

import clases.ejercicio5.Naipe;
import clases.ejercicio5.Palo;
import clases.ejercicio5.Rango;
import static clases.ejercicio5.Rango.*;


public class NaipeBJ extends Naipe {

	public NaipeBJ(Palo palo, Rango rango) {
		super(palo, rango, rango == ACE || rango == QUEEN ||
				rango == JACK || rango == KING ? 10 : rango.ordinal() + 1);
	}

	public int getValor(boolean corregir) {
		if (getRango() == ACE && corregir)
			return 1;
		else
			return getValor();
	}
	
    @Override
    public int getValor() {
    	return getValor(false);
    }
	
}
