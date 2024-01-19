package clases.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import clases.ejercicio5.Naipe;
import clases.ejercicio5.Palo;
import clases.ejercicio5.Rango;

public class Mazo {

	private static final Random R = new Random();
	private ArrayList<Naipe> naipes = new ArrayList<>();
	
	public Mazo() {
		agregarBaraja();
	}
	
	public Mazo(int n) {
		for (int i=0; i<n; i++)
			agregarBaraja();
	}
	
	private void agregarBaraja() {
		for (Palo p: Palo.values())
			for (Rango r: Rango.values())
				naipes.add(new Naipe(p, r));
	}
	
	public void barajar() {
		Collections.shuffle(naipes);
	}
	
	public Naipe get() {
		return naipes.get(R.nextInt(naipes.size()));
	}
	
	public Naipe remove() {
		return naipes.remove(R.nextInt(naipes.size()));
	}
	
	public void add(Naipe naipe) {
		naipes.add(naipe);
	}
	
	public void addAll(Mazo mazo) {
		naipes.addAll(mazo.naipes);
		mazo.naipes.clear();
	}
	
	public List<Naipe> getNaipes() {
		return Collections.unmodifiableList(naipes);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(naipes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mazo other = (Mazo) obj;
		return Objects.equals(naipes, other.naipes);
	}

	@Override
	public String toString() {
		return "Mazo [naipes=" + naipes + "]";
	}
	
}
