package naipes;

public enum Palo {
	TREBOLES('♣'), DIAMANTES('♦'), CORAZONES('♥'), PICAS('♠');
	
	private char simbolo;
	
	Palo(char simbolo) {
		this.simbolo = simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
	@Override
	public String toString() {
		return String.valueOf(simbolo);
	}
}
