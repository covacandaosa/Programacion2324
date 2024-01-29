package naipes;

public enum Rango {
	ACE("A"), DOS("2"), TRES("3"), CUATRO("4"),
	CINCO("5"), SEIS("6"), SIETE("7"), OCHO("8"),
	NUEVE("9"), DIEZ("10"), JACK("J"), QUEEN("Q"), KING("K");
	
	String texto;

	private Rango(String texto) {
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return texto;
	}
}
