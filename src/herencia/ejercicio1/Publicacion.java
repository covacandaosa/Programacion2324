package herencia.ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Publicacion {
	
	private int codigo;
	private String titulo;
	private int año;
	
	public Publicacion(int codigo, String titulo, int año) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}
	
	public Publicacion(int codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
		año = LocalDate.now().getYear();
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAño() {
		return año;
	}

	@Override
	public int hashCode() {
		return Objects.hash(año, codigo, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return año == other.año && codigo == other.codigo && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", titulo=" + titulo + ", año=" + año + "]";
	}
	
	
	
}
