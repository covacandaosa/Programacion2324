package cadenas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa que lea nombres y construya un triángulo
 * con sus caracteres tal y como se muestra en el ejemplo siguiente:
 * 				
 * 					H
 * 					He
 * 					Her
 * 					Herm
 * 					Herme
 * 					Hermen
 * 					Hermene
 * 					Hermeneg
 * 					Hermenegi
 * 					Hermenegil
 * 					Hermenegild
 * 					Hermenegildo
 * 
 */

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		System.out.print("Nombre: ");
		while (!(linea = in.readLine()).equalsIgnoreCase("fin")) {
			triangulo(linea);
			System.out.print("Nombre: ");
		}
	}

	static void triangulo(String nombre) {
		for (int i=1; i<=nombre.length(); i++)
			System.out.println(nombre.substring(0, i));
	}
	
}
