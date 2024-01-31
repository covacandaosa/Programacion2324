package colecciones.i;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio7 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) { 
			System.out.print("> ");
			Set<Integer> set1 = new HashSet<>();
			Set<Integer> set2 = new HashSet<>();
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			System.out.print("> ");
			for (int i=0; i<n1; i++)
				set1.add(in.nextInt());
			for (int i=0; i<n2; i++)
				set2.add(in.nextInt());
			Set<Integer> interseccion = new HashSet<>(set1);
			interseccion.retainAll(set2);
			System.out.println(interseccion);
		}
	}

/*
 
4 3
1 3 5 7 3 4 5
  
*/
	
	
}
