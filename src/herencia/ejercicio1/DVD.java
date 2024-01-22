package herencia.ejercicio1;

public class DVD extends Publicacion implements Prestable {

	private int duración;
	private String prestado;

	public DVD(int codigo, String titulo, int año, int duración) {
		super(codigo, titulo, año);
		this.duración = duración;
	}

	public DVD(int codigo, String titulo, int duración) {
		super(codigo, titulo);
		this.duración = duración;
	}
	
	public void prestar() {
		prestado = "si";
	}
	
	public void devolver() {
		prestado = "no";
	}
	
	public boolean estaPrestado() {
		return prestado.equals("si");
	}
	
}
