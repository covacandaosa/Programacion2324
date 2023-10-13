package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Pedir un número por teclado y dibujar un triángulo rectángulo con
 * asteriscos. Por ejemplo, con n=4 el triángulo será de la forma:
 * 
 * 			* * * *
 * 			* * *
 * 			* *
 * 			*
 * 
 */

public class Ejercicio20 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dime un número");
		int n = Integer.parseInt(in.readLine());
		for (int i=n; i>0; i--) {
			for (int j=1; j<=i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
