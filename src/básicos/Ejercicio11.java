package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Construir un programa que indique si un número introducido por
 * teclado es positivo, negativo o cero.
 * 
 */

public class Ejercicio11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Número: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		float n = Float.parseFloat(in.readLine());
		if (n > 0) 
			System.out.println("positivo");
		else if (n < 0)
			System.out.println("negativo");
		else
			System.out.println("cero");
	}

}
