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
		System.out.print("> ");
		while (!(linea = in.readLine()).equalsIgnoreCase("fin"))
			System.out.print(primeroQueNoSeRepite(linea) + "\n> ");
	}
	
	static char primeroQueNoSeRepite(String s) {
		int i = 0;
		while (i < s.length() && (i != s.indexOf(s.charAt(i)) || i != s.lastIndexOf(s.charAt(i))))
			i++;
		return s.charAt(i);
	}

}
