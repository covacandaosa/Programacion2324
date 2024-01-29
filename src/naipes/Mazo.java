package naipes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Mazo <T extends Naipe> {

	private static final Random R = new Random();
	private ArrayList<T> naipes = new ArrayList<>();
	
	public void barajar() {
		Collections.shuffle(naipes);
	}
	
	public T get() {
		return (T) naipes.get(R.nextInt(naipes.size()));
	}
	
	public T remove() {
		return naipes.remove(R.nextInt(naipes.size()));
	}
	
	public void add(T naipe) {
		naipes.add(naipe);
	}
	
	public void addAll(Mazo<T> mazo) {
		naipes.addAll(mazo.naipes);
		mazo.naipes.clear();
	}
	
	public List<T> getNaipes() {
		return Collections.unmodifiableList(naipes);
	}
	
	public int size() {
		return naipes.size();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(naipes);
	}

	@Override
	public String toString() {
		return naipes.toString();
	}
	
}
