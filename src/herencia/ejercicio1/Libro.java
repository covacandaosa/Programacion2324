package herencia.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Libro extends Publicacion implements Prestable {

	private ArrayList<String> autores = new ArrayList<>();
	private boolean prestado;

	public Libro(int codigo, String titulo, int año, String ... autores) {
		super(codigo, titulo, año);
		this.autores.addAll(Arrays.asList(autores));
//		for (String nombre: nombres) 
//			autores.add(nombre);
	}

	public Libro(int codigo, String titulo, String ... autores) {
		super(codigo, titulo);
		this.autores.addAll(Arrays.asList(autores));
//		for (String nombre: nombres) 
//			autores.add(nombre);
	}
	
	public List<String> getAutores() {
		return Collections.unmodifiableList(autores);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(autores);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autores, other.autores);
	}

	@Override
	public String toString() {
		return "Libro [autores=" + autores + "]" + super.toString();
	}
	
	public void prestar() {
		prestado = true;
	}
	
	public void devolver() {
		prestado = false;
	}
	
	public boolean estaPrestado() {
		return prestado;
	}
	
}
