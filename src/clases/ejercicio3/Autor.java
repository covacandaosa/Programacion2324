package clases.ejercicio3;

public class Autor {

	private String nombre;
	private String email;
	private Genero género = Genero.FEMENINO;
	
	public Autor(String nombre, String email, Genero género) {
		this.nombre = nombre;
		this.email = email;
		this.género = género;
	}
	
	public Autor(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public Genero getGénero() {
		return género;
	}

	@Override
	public String toString() {
		return nombre + "(" + género + ")" + email;
	}
	
	
	
}
