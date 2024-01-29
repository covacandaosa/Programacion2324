package naipes.blackjack;

import naipes.Mazo;
import naipes.Rango;

public class ManoBJ extends Mazo<NaipeBJ> {

	private int valor;
	private int ases;
	
	public int getValor() {
		return valor;
	}
	
	@Override
	public void add(NaipeBJ naipe) {
		super.add(naipe);
		valor += naipe.getValor();
		if (naipe.getRango() == Rango.ACE)
			ases++;
		while (valor > 21 && ases > 0) {
			valor -= 10;
			ases--;
		}
	}
	
	public void reset(Mazo<NaipeBJ> mazo) {
		mazo.addAll(this);
		ases = valor = 0;
	}
	
}
