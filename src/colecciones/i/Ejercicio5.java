package colecciones.i;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) { 
			Queue<Integer> cola = new LinkedList<>();
			System.out.print("> ");
			int n = in.nextInt();
			int k = in.nextInt();
			int x = in.nextInt();
			System.out.print("> ");
			for (int i=0; i<n; i++)
				cola.offer(in.nextInt());
			for (int i=0; i<k; i++)
				cola.poll();
			boolean xEstaAlmacenado = false;
			int min = Integer.MAX_VALUE;
			for (int i=0; i<cola.size(); i++) {
				int v = cola.poll();
				if (v < min)
					min = v;
				xEstaAlmacenado = (v == x);
				cola.offer(v);
			}
			System.out.println(xEstaAlmacenado ? true : min);
		}
	}

}
