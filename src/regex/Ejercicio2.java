package regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String fecha;
		System.out.print("Fecha: ");
		while (!(fecha = in.readLine()).equalsIgnoreCase("fin")) {
			if (fecha.matches("\\d{2}([-/])(?:\\w{3}|\\d{2})\\1\\d{4}"))
				System.out.println("correcta");
			else
				System.out.println("incorrecta");
			System.out.print("Fecha: ");
		}
	}

}
