package colecciones.i;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new LinkedList<>();
		for (int i=0; i<100; i++)
			lista.add(r.nextInt(2000) + 1);
		mostrar(lista, 1);
		mostrar(new HashSet<>(lista), 2);
		mostrar(new TreeSet<>(lista), 3);
	}
	
	static void mostrar(Collection<Integer> c, int metodo) {
		switch (metodo) {
		case 1:
			Iterator<Integer> i = c.iterator();
			while (i.hasNext())
				System.out.print(i.next() + " ");
			break;
		case 2:
			for (int n: c)
				System.out.print(n + " ");
			break;
		case 3:
			c.forEach(n -> System.out.print(n + " "));
			break;
		}
		System.out.println();
	}

}
