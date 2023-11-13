package arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * Programa que realice las tareas siguientes:
 * 
 *     • Crear un vector de números enteros de un tamaño aleatorio comprendido
 *       entre 10 y 50 elementos.
 *       
 *     • Llenar el vector con números aleatorios comprendidos entre -100 y 100
 *       sin repetir ninguno.
 *     
 *     • Crear un segundo vector que contenga los elementos del anterior almacenados
 *       en orden inverso.
 *       
 *     • Mostrar ambos vectores en la consola.
 *     
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		Random r = new Random();
		int [] v = new int[r.nextInt(41) + 10];
		for (int i = 0; i < v.length; i++) {
			int n;
			do {
				n = r.nextInt(201) - 100;
			} while (contiene(v, n)); /* mientras el array ya contenga a n */
			v[i] = n;
		}
		
		System.out.println(Arrays.toString(v));
	}

	/*
	 * retorna true si v contiene a n
	 */
	static boolean contiene(int[] v, int n) {
		
	}
	
}
