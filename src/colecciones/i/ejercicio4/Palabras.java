package colecciones.i.ejercicio4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palabras {

	Map<Integer, Set<String>> palabras;
	
	public Palabras() {
		palabras = new TreeMap<>();
	}
	
	public Palabras(String texto) {
		this();
		Matcher m = Pattern.compile("\\S+").matcher(texto);
		while (m.find()) {
			
		}
	}
}
