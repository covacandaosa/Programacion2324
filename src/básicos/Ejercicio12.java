package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Calcule la suma de la serie 1/1 + 1/2 + 1/3 + ... + 1/N,
 * donde el número N se introducirá por teclado.
 * 
 */

public class Ejercicio12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Número: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		float n = Integer.parseInt(in.readLine());
		float suma = 0;
		for (float i=1; i<n; i++)
			suma += 1 / i;
		System.out.println("Suma = " + suma);
	}

}
