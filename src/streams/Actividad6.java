package streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Actividad6 {

	public static void main(String[] args) {

		/*
		 * Calcular una media con los valores numéricos almacenados en una lista
		 * 
		 */
		List<Integer> l;
		l = List.of(31, 17, 25, 9, 1);
		double m = l.stream().collect(Collectors.averagingDouble(n -> n));

		/*
		 * Lo mismo, pero usando sólo el 70% de cada valor
		 * 
		 */
		m = l.stream().collect(Collectors.averagingDouble(n -> n * .7d));
		m = l.stream().map(n -> n * .7d).collect(Collectors.averagingDouble(n -> n));

		/*
		 * Crear una cadena de caracteres uniendo las cadenas almacenadas en una lista y
		 * añadiendo un espacio entre ellas:
		 */
		List<String> l2 = List.of("Hola", "Mundo!");
		String s = l2.stream().collect(Collectors.joining(" "));
		System.out.println(s);
		s = l.stream().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(s);

		/*
		 * Crear un conjunto con los números impares de una secuencia de números
		 * enteros:
		 */
		l = List.of(31, 20, 17, 25, 6, 9, 1, 58);
		Set<Integer> set1 = l.stream().filter(n -> n % 2 == 1).collect(Collectors.toSet());
		System.out.println(set1);
		TreeSet<Integer> set2 = l.stream().filter(n -> n % 2 == 1).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2);

		/*
		 * Crear una lista inmodificable con las cadenas de una secuencia que tengan una
		 * longitud par:
		 * 
		 */
		List<String> palabras = List.of("a", "aa", "aaa", "aaaa", "aaaaa");
		List<String> palabrasDeLongitudPar = palabras.stream().filter(p -> p.length() % 2 == 0)
				.collect(Collectors.toUnmodifiableList());
		System.out.println(palabrasDeLongitudPar);
		
		/* 
		 * Crear un mapa que asocie cada nombre de vendedor con el importe
		 * total de sus ventas a partir de una lista de ventas
		 * 
		 */
		List<Venta> ventas = List.of(new Venta("Pepe", 45.99f), 
				new Venta("Pepín", 99.99f), new Venta("Pepe", 100),
				new Venta("Pepón", 50.45f), new Venta("Pepín", 30));
		Map<String, Float> totales = ventas
				.stream()
				.collect(Collectors.toMap(v -> v.getVendedor(), v -> v.getImporte(), (importe1, importe2) -> importe1 + importe2));
	}

	static class Venta {
		String vendedor;
		float importe;

		public Venta(String vendedor, float importe) {
			this.vendedor = vendedor;
			this.importe = importe;
		}

		public String getVendedor() {
			return vendedor;
		}

		public float getImporte() {
			return importe;
		}
	}

}
