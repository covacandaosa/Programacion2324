package colecciones.i.ejercicio4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palabras {

	Map<Integer, Set<String>> palabras;
	
	public Palabras() {
		palabras = new TreeMap<>();
	}
	
	public Palabras(String texto) {
		this();
		añadirPalabras(texto);
	}
	
	public void añadirPalabras(String texto) {
		Matcher m = Pattern.compile("\\S+").matcher(texto);
		while (m.find())
			añadirPalabra(m.group());
	}
	
//	public boolean añadirPalabra(String palabra) {
//		int longitud = palabra.length();
//		Set<String> set;
//		if (palabras.containsKey(longitud)) {
//			set = palabras.get(longitud);
//			return set.add(palabra);
//		}
//		else {
//			set = new TreeSet<>();
//			boolean añadida = set.add(palabra);
//			palabras.put(longitud, set);
//			return añadida;
//		}
//	}
	
	
//	public boolean añadirPalabra(String palabra) {
//		int longitud = palabra.length();
//		Set<String> set = palabras.get(longitud);;
//		if (set == null)
//			palabras.put(longitud, set = new TreeSet<>());
//		return set.add(palabra);
//	}
	
	public boolean añadirPalabra(String palabra) {
		int longitud = palabra.length();
		palabras.computeIfAbsent(longitud, l -> new TreeSet<>());
		return palabras.get(longitud).add(palabra);
	}
	
	public boolean contienePalabra(String palabra) {
		Set<String> set = palabras.get(palabra.length());
//		return set == null ? false : set.contains(palabra);
		return set != null && set.contains(palabra);
	}
}
