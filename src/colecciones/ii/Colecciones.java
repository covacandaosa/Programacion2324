package colecciones.ii;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Colecciones {

	/*
	 * EJERCICIO 1
	 * -----------
	 * Método que acepte un conjunto de cadenas y elimine del mismo
	 * todas aquellas cadenas de una longitud par.
	 * 
	 * No se permite el uso de ninguna otra estructura de datos auxiliar.
	 * 
	 */
	public static void eliminarLasDeLongitudPar(Set<String> set) {
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			String s = i.next();
			if (s.length() % 2 == 0)
				i.remove();
		}
	}
	
	/*
	 * EJERCICIO 2
	 * -----------
	 * Método que acepte un conjunto de números enteros y retorne true
	 * si contiene al menos un número impar o false en caso contrario.
	 * 
	 */
	public static boolean contieneImpares(Set<Integer> set) {
		for (Integer n: set)
			if (n % 2 != 0)
				return true;
		return false;
		
//		return set.stream().filter(n -> n % 2 != 0).count() > 0;
	}
	
	/*
	 * EJERCICIO 3
	 * -----------
	 * Método que acepte un mapa de cadenas a cadenas y retorne false si dos
	 * o más claves se asocian a un mismo valor o true en caso contrario.
	 *  
	 */

	public static boolean valoresUnicos(Map<String, String> map) {
		Collection<String> valores = map.values();
//		return valores.size() == new HashSet<>(valores).size();
		return valores.size() == valores.stream().distinct().count();
		
	}
	
	/*
	 * EJERCICIO 4
	 * -----------
	 * Método llamado algunaSeRepiteAlMenos3Veces que acepte una lista de
	 * cadenas como parámetro y retorne verdadero si alguna cadena se repite
	 * al menos 3 veces en la lista o falso en caso contrario.
	 * Resolver el problema utilizando un mapa como almacenamiento auxiliar
	 * 
	 */
	
	public static boolean algunaSeRepiteAlMenos3Veces(List<String> list) {
		Map<String, Integer> mapa = new HashMap<>();
//		for (String s: list) {
//			if (mapa.containsKey(s)) {
//				int contador = mapa.get(s);
//				contador++;
//				mapa.put(s, contador);
//			}
//			else {
//				mapa.put(s, 1);
//			}
//			for (int contador: mapa.values()) {
//				if (contador >= 3)
//					return true;
//			}
//		}
//		return false;
		
//		for (String s: list) {
//			if (mapa.containsKey(s)) {
//				int contador = mapa.get(s);
//				contador++;
//				if (contador >= 3)
//					return true;
//				mapa.put(s, contador);
//			}
//			else {
//				mapa.put(s, 1);
//			}
//		}
//		return false;
		
		for (String s: list) {
			Integer contador = mapa.putIfAbsent(s, 1);
			if (contador != null) {
				if (contador == 2)
					return true;
				else
					mapa.replace(s, contador + 1);
			}
		}
		return false;
	}
	
}
