package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que incluya un método que lleve como parámetro
 * un String introducido por teclado y que busque en él las vocales
 * indicándonos la posición en la que están.
 * 
 */

public class Ejercicio31 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Cadena: ");
		System.out.println(buscarVocales(in.readLine()));
	}

	static String buscarVocales(String s) {
		s = s.toLowerCase();
		StringBuilder resultado = new StringBuilder("Posiciones: ");
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				resultado.append(i + 1).append(", ");
		}
		return resultado.toString();
	}

}
