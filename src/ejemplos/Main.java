package ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  Escribe un programa que incluya un método que lleve como parámetro
 *  un String introducido por teclado y que busque en él las vocales
 *  indicándonos la posición en la que están.
 *  
 */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Candena: ");
		posicionDeLasVocales(in.readLine().toLowerCase());
	}
	
	static void posicionDeLasVocales(String s) {
		String resultado = "Posición de las vocales: ";
		String s1 = "Posición de las vocales: ";
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				resultado = resultado + (i+1) + " ";
		    default:
			}
		}
		System.out.println(resultado);
		String s2 = "Posición de las vocales: ";
		System.out.println(s2);
	}

}
