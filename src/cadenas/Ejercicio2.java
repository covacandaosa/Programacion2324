package cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Escribe un programa que lea dos cadenas y muestre el número
 * de veces que encuentra cada palabra de la primera dentro de
 * la segunda.
 * 
 */

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cadena 1: ");
		String cadena1 = in.readLine();
		System.out.println("Cadena 2: ");
		String cadena2 = in.readLine();
		Scanner scanner = new Scanner(cadena1);
		while (scanner.hasNext()) {
			String palabra = scanner.next();
			int n = numeroDeVecesContenida(palabra, cadena2); 
			System.out.println(palabra + ": " + n);
		}
	}
	
	
	/*
	 * Retrorna el número de veces que cadena1 está contenida
	 * en cadena2
	 */
	static int numeroDeVecesContenida(String cadena1, String cadena2) {
		int i = 0;
		int contador = 0;
		int j;
		while ((j = cadena2.indexOf(cadena1, i)) != -1) {
			contador++;
			i = j + cadena1.length();
		}
		return contador;
	}
	
}
