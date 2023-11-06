package cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Programa que lee dos cadenas y muestra el número de veces
 * que la segunda está contenida en la primera.
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cadena 1: ");
		String cadena1 = in.readLine();
		System.out.println("Cadena 2: ");
		String cadena2 = in.readLine();
		int i = 0;
		int contador = 0;
		int j;
		while ((j = cadena1.indexOf(cadena2, i)) != -1) {
			contador++;
			i = j + cadena2.length();
		}
		System.out.println(contador);
	}

}
