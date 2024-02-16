package streams;

import java.util.List;

public class Pruebas {

	public static void main(String[] args) {
		List<String> l = List.of("esto", "es", "una", "prueba", "de", "streams", "de", "Java");
		/* Averigua si la lista contiene palabras de longitud impar que
		 * empiecen por una vocal.
		 */
		boolean b = l.stream()
			.filter(s -> s.length() % 2 == 1)
			.anyMatch(s -> "aeiou".contains(String.valueOf(s.charAt(0))));
		System.out.println(b);
		
		/* 
		 * Crea una lista con las longitudes de las palabras de longitud par
		 */
		List<Integer> longitudes = l
				.stream().filter(Pruebas::esDeLongitudPar)	// s -> s.length() % 2 == 0
				.map(String::length)				//s -> s.length()
				.distinct()
				.toList();	
	}

	static boolean esDeLongitudPar(String s) {
		return s.length() / 2 == 0;
	}
	
}
