package colecciones.ii;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PruebaColecciones {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int ejercicio;
		Runnable [] ejercicios = {
				PruebaColecciones::pruebaEjercicio1,
				PruebaColecciones::pruebaEjercicio2,
				null,
				null,
				PruebaColecciones::pruebaEjercicio5,
				PruebaColecciones::pruebaEjercicio6
		};
		System.out.print("Ejercicio (0 para salir): ");
		while ((ejercicio = Integer.parseInt(in.readLine())) != 0) {
			try {
				ejercicios[ejercicio - 1].run();
			} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
				System.out.println("El ejercicio '" + ejercicio + "' no existe");
			}
		}
	}

	static void pruebaEjercicio1() {
		Set<String> set = new HashSet<>(Set.of("a", "aa", "aaa", "aaaa"));
		Colecciones.eliminarLasDeLongitudPar(set);
		System.out.println(set);
	}
	
	static void pruebaEjercicio2() {
		System.out.println(Colecciones.contieneImpares(Set.of(1, 2, 3, 4)));
		System.out.println(Colecciones.contieneImpares(Set.of(2, 4, 6, 8)));
	}
	
	static void pruebaEjercicio5() {
		Deque<Integer> pila = new ArrayDeque<>();
		for (int n: List.of(23, -5, 37, 29, -19, -55, 89))
			pila.push(n);
		System.out.println(pila);
		Colecciones.negativosAbajoPositivosArriba(pila);
		System.out.println(pila);
	}
	
	static void pruebaEjercicio6() {
		System.out.println(Colecciones.moda(List.of(1, 2, 3, 2, 1, 2, 5)));
	}
	
}
