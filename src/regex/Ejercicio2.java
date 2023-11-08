package regex;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * Escribe un programa que use una expresión regular para validar
 * fechas, teniendo en cuenta que una fecha es válida si cumple
 * las condiciones siguientes:
 * 
 * 		* Comienza por dos dígitos para el día del mes seguidos
 *        de un separador.
 *      * A continuación, le siguen tres letras para el mes o dos
 *        dígitos para el número del mes, seguidos de un separador.
 *      * A continuación, le siguen cuatro dígitos para el año. 
 *      * El separador puede ser un guion ('-') o la barra inclinada
 *        ('/').
 *      * No se pueden combinar diferentes separadores en una misma
 *        fecha.
 *        
 * El usuario introducirá fechas y el programa tendrá que determinar
 * si son válidas o no.
 *  
 * 
 */

public class Ejercicio2 {

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		String fecha;
//		System.out.print("Fecha: ");
//		while (!(fecha = in.readLine()).equalsIgnoreCase("fin")) {
//			if (fecha.matches("\\d{2}([-/])(?:\\w{3}|\\d{2})\\1\\d{1,4}"))
//				System.out.println("correcta");
//			else
//				System.out.println("incorrecta");
//			System.out.print("Fecha: ");
//		}
//	}

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		Pattern pattern = Pattern.compile("(?:0[1-9]|[12]\\d|3[01])([-/])(?:\\w{3}|(?:0[1-9]|1[0-2]))\\1\\d{1,4}");
//		String fecha;
//		System.out.print("Fecha: ");
//		while (!(fecha = in.readLine()).equalsIgnoreCase("fin")) {
//			if (pattern.matcher(fecha).matches())
//				System.out.println("correcta");
//			else
//				System.out.println("incorrecta");
//			System.out.print("Fecha: ");
//		}
//	}

	public static void main(String[] args) throws IOException {

		try (Scanner in = new Scanner(System.in)) {
			String fecha;
			do {
				System.out.print("Fechas: ");
				try {
					fecha = in.next("(?:0[1-9]|[12]\\d|3[01])([-/])(?:\\w{3}|(?:0[1-9]|1[0-2]))\\1\\d{1,4}|fin");
					if (!fecha.equalsIgnoreCase("fin"))
						System.out.println(fecha + ": correcta");
				} catch (NoSuchElementException e) {
					fecha = in.next();
					System.out.println(fecha + ": incorrecta");
				}
			} while (!fecha.equalsIgnoreCase("fin"));
		}
	}

}
