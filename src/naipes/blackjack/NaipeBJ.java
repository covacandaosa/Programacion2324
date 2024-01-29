package naipes.blackjack;

import naipes.Naipe;
import naipes.Palo;
import naipes.Rango;
import static naipes.Rango.*;

public class NaipeBJ extends Naipe {

	public NaipeBJ(Palo palo, Rango rango) {
		super(palo, rango, rango == ACE ? 11 : rango == QUEEN ||
				rango == JACK || rango == KING ? 10 : rango.ordinal() + 1);
	}

	public int getValor(boolean corregir) {
		Rango rango = getRango();
		switch (rango) {
		case ACE:
			return corregir ? 1 : 11;
		case JACK:
		case QUEEN:
		case KING:
			return 10;
		default:
			return rango.ordinal() + 1;
		}
		
	}
	
    @Override
    public int getValor() {
    	return getValor(false);
    }
	
}
