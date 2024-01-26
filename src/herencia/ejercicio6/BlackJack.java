package herencia.ejercicio6;

import clases.ejercicio6.Mazo;

public class BlackJack {

	private ManoBJ crupier = new ManoBJ();
	private ManoBJ jugador = new ManoBJ();
	private MazoBJ mazo = new MazoBJ(6);
	private Mazo descarte = new Mazo();
	private boolean iniciada;
	
	public void repartir() {
		if (iniciada)
			throw new IllegalStateException();
		descarte.addAll(crupier);
		descarte.addAll(jugador);
		if (mazo.size() < 52)
			mazo.addAll(descarte);
		crupier.add(mazo.get());
		jugador.add(mazo.get());
		crupier.add(mazo.get());
		jugador.add(mazo.get());
		iniciada = true;
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
		}
		else {
			crupier.getNaipes().forEach(n -> sb.append(n));
		}
		sb.append(";");
		jugador.getNaipes().forEach(n -> sb.append(n));
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
