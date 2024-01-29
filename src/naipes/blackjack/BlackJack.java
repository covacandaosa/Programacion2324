package naipes.blackjack;

import naipes.Mazo;
import naipes.Palo;
import naipes.Rango;

public class BlackJack {

	private ManoBJ crupier = new ManoBJ();
	private ManoBJ jugador = new ManoBJ();
	private Mazo<NaipeBJ> mazo = new Mazo<>();
	private Mazo<NaipeBJ> descarte = new Mazo<>();
	private boolean iniciada;
	
	public BlackJack(int n) {
		for (int i=0; i<n; i++)
			for (Palo p: Palo.values())
				for (Rango r: Rango.values())
					mazo.add(new NaipeBJ(p, r));
	}
	
	public void repartir() {
		if (iniciada)
			throw new IllegalStateException();
		crupier.reset(descarte);
		jugador.reset(descarte);
		if (mazo.size() < 52)
			mazo.addAll(descarte);
		crupier.add(mazo.get());
		jugador.add(mazo.get());
		crupier.add(mazo.get());
		jugador.add(mazo.get());
		iniciada = true;
	}
	
	public boolean manoEnCurso() {
		return iniciada;
	}
	
	public void pedir() {
		if (!iniciada)
			throw new IllegalStateException();
		jugador.add(mazo.get());
		if (jugador.getValor() >= 21)
			iniciada = false;
	}
	
	public void plantarse() {
		if (!iniciada)
			throw new IllegalStateException();
		while (crupier.getValor() < 17)
			crupier.add(mazo.get());
		iniciada = false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (iniciada) {
			sb.append(crupier.getNaipes().get(0));
			sb.append("**");
			sb.append(";?");
		}
		else {
			crupier.getNaipes().forEach(n -> sb.append(n));
			sb.append(";");
			sb.append(String.valueOf(crupier.getValor()));
		}
		sb.append(";");
		jugador.getNaipes().forEach(n -> sb.append(n));
		sb.append(";");
		sb.append(String.valueOf(jugador.getValor()));
		if (!iniciada && jugador.size() > 0) {
			sb.append(";");
			int vc = crupier.getValor();
			int vj = jugador.getValor();
			if (vj > 21)
				sb.append("P");
			else if (vc == 21 && crupier.size() == 2)
				sb.append("PBJ");
			else if (vj == 21 && jugador.size() == 2)
				sb.append("GBJ");
			else if (vc > 21 || vc < vj)
				sb.append("G");
			else if (vc == vj)
				sb.append("E");
			else
				sb.append("P");
		}
		return sb.toString();
	}
	
}
