package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que lea el nombre del usuario y a
 * continuación muestre muestre los segundos y milisegundos
 * que ha tardado en contestar, con un formato de salida que
 * emplee exactamente 3 dígitos en la parte decimal.
 * 
 */

public class Ejercicio17 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Hola, dime tu nombre: ");
		long t0 = System.currentTimeMillis();
		String nombre = in.readLine();
		long t1 = System.currentTimeMillis();
		long t = t1 - t0;
		double segundos = t / 1000d;
		System.out.printf("%s, has tardado %.3f segundos en contestar.\n", nombre, segundos);
	}

}
