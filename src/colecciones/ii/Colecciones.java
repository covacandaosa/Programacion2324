package colecciones.ii;

import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Queue;
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
		
//		for (String s: list) {
//			Integer contador = mapa.putIfAbsent(s, 1);
//			if (contador != null) {
//				if (contador == 2)
//					return true;
//				else
//					mapa.replace(s, contador + 1);
//			}
//		}
//		return false;
		
		for (String s: list) {
			Optional<Integer> contador = Optional.of(mapa.putIfAbsent(s, 0));
			if (!contador.isEmpty() && contador.equals(2))
					return true;
			else
				mapa.replace(s, contador.orElse(0) + 1);
		}
		return false;
	}
	
	/*
	 * EJERCICIO 5
	 * -----------
	 * Método llamado negativosAbajoPositivosArriba que acepte una pila de
	 * números enteros como parámetro y la reorganice para que se queden
	 * debajo los negativos y encima los positivos. Usa una cola como
	 * estructura de datos auxiliar para realizar el proceso.
	 * 
	 * Ejemplo:
	 * 		Entrada: [23, -5, 37, 29, -19, -55, 89] <- Tope de la pila
	 * 		Salida:  [-55, -19, -5, 23, 89, 29, 37] <- Tope de la pila
	 * 
	 */
	
	public static void negativosAbajoPositivosArriba(Deque<Integer> pila) {
		Queue<Integer> cola = new LinkedList<>();
		while (!pila.isEmpty())
			cola.offer(pila.pop());
		int n = cola.size();
		for (int i=0; i<n; i++) {
			int v = cola.poll();
			if (v < 0)
				pila.push(v);
			else
				cola.offer(v);
		}
		while (!cola.isEmpty())
			pila.push(cola.poll());
	}
	
	/*
	 * Método llamado moda que acepte una lista de números enteros
	 * como parámetro y retorne el número que se repite con mayor
	 * frecuencia (la moda) o lanzar una exceción si la lista está
	 * vacía.
	 * 
	 */
	static int moda(List<Integer> lista) {
		if (lista == null || lista.isEmpty())
			throw new IllegalArgumentException();
		Map<Integer, Integer> mapa = new HashMap<>();
		for(int n: lista) {
			Integer contador = mapa.get(n);
			if (contador == null)
				mapa.put(n, 1);
			else
				mapa.replace(n, contador + 1);
		}
//		int n = 0, max = Integer.MIN_VALUE;
//		for (Entry<Integer, Integer> e: mapa.entrySet()) {
//			if (e.getValue() > max) {
//				n = e.getKey();
//				max = e.getValue();
//			}
//		}
//		return n;
		return mapa.entrySet().stream().max((e1, e2) -> e1.getValue() - e2.getValue()).get().getKey();
	}
	
	/*
	 * Método llamado eliminarSiMayoresEncima que acepte una pila de números enteros
	 * como parámetro y elimine de ella los elementos que tienen por encima alguno
	 * cuyo valor sea mayor.
	 * 
	 * Por ejemplo, suponiendo que una pila almacena los siguientes números:
	 * 	
	 *          [6, 22, 17, 17, 10, 7, 9, 14, 5, 12, 7, 2] <- Tope
	 *          
	 * Los números 5, 9, 7, 10 y 6 deben eliminarse porque todos ellos tienen algún
	 * número mayor por encima.
	 * 
	 * Sólo se permite el uso de otras pilas o colas para solucionar este problema.
	 */
	
	static void eliminarSiMayoresEncima(Deque<Integer> pila) {
		
	}
}
