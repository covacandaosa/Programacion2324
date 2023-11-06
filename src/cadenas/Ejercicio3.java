package cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que lea líneas hasta que se introduzca en una
 * de ellas la cadena "fin" sin importar si se hace en mayúsculas o 
 * en minúsculas o en cualquier combinación de ambas.
 * Por cada línea leída, excepto la última, mostrará cuál es el primer
 * carácter que no se repite.
 * 
 */

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		while (!(linea = in.readLine()).equalsIgnoreCase("fin")) {
			for (int i=0; i<linea.length(); i++) {
				char c = linea.charAt(i);
				int j = linea.indexOf(c, i + 1);
				if (j == -1) {
					System.out.println(c);
					break;
				}
			}
		}
		
	}

}
