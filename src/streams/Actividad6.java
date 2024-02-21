package streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Actividad6 {

	public static void main(String[] args) {
		
		/* 
		 * Calcular una media con los valores
		 * numéricos almacenados en una lista
		 * 
		 */
		List<Integer> l = List.of(31, 17, 25, 9, 1);
		double m = l.stream().collect(Collectors.averagingDouble(n -> n));
		
		/* 
		 * Lo mismo, pero usando sólo el 70% de cada valor
		 * 
		 */
		m = l.stream().collect(Collectors.averagingDouble(n -> n * .7d));
		m = l.stream().map(n -> n * .7d).collect(Collectors.averagingDouble(n -> n));
		
		/* 
		 * Crear una cadena de caracteres uniendo las cadenas almacenadas
		 * en una lista y añadiendo un espacio entre ellas:
		 */
		List<String> l2 = List.of("Hola", "Mundo!");
		String s = l2.stream().collect(Collectors.joining(" "));
		System.out.println(s);
		s = l.stream().
	}

}
