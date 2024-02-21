package streams;

import java.util.List;
import java.util.stream.Stream;

public class Actividad4 {

	public static void main(String[] args) {
		List<Integer> l = List.of(1, 5, 3, 9, 7);
		Integer max = l.stream().reduce(Math::max).get();
		System.out.println(max);
		int total = l.stream().reduce(Integer::sum).orElse(0);
		System.out.println(total);
		Stream<Integer> s = Stream.empty();
		total = s.reduce(Integer::sum).orElse(0);
		System.out.println(total);
		total = l.stream().reduce(1, Math::multiplyExact);
		System.out.println(total);
		total = l.stream().reduce(Math::multiplyExact).orElse(1);
		s = Stream.empty();
		total = s.reduce(1, Math::multiplyExact);
		System.out.println(total);
		List<Producto> p = List.of(new Producto("a", 10), new Producto("b", 11)); 
		float total2 = p.stream().reduce(0f, (subt, sgte) -> subt + sgte.precio, Float::sum);
		System.out.println(total2);
	}

	static class Producto {
		String descripcion;
		float precio;
		public Producto(String descripcion, float precio) {
			this.descripcion = descripcion;
			this.precio = precio;
		}
	}
}
