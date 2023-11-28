package arrays.mas;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 *  
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int [] v = new int[10];
			for (int i=0; i<v.length; i++)
				v[i] = pedirNumero(in, "Introduce un número: ");
		}
	}
	
//	static int pedirNumero(Scanner in, String mensaje) {
//		int n = 0;
//		boolean correcto = false;
//		while (!correcto) {
//			System.out.print(mensaje);
//			try {
//				n = in.nextInt();
//				correcto = true;
//			} catch (InputMismatchException e) {
//				System.out.println("Error, \"" + in.next() + "\" no es un número.");
//			}
//		}
//		return n;
//	}
	
//	static int pedirNumero(Scanner in, String mensaje) {
//		int n = 0;
//		boolean correcto = false;
//		while (!correcto) {
//			System.out.print(mensaje);
//			try {
//				n = in.nextInt();
//				correcto = true;
//			} catch (InputMismatchException e) {
//				System.out.println("Error, \"" + in.next() + "\" no es un número.");
//			}
//		}
//		return n;
//	}
	
	static int pedirNumero(Scanner in, String mensaje) {
//		while (true) {
		for (;;) {
			System.out.print(mensaje);
			try {
				return in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error, \"" + in.next() + "\" no es un número.");
			}
		}
	}

}
