package regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *	Escribe un programa que use una expresión regular para
 *  encontrar nombres de personas en un texto, teniendo en
 *  cuenta que un nombre es válido si cumple las condiciones
 *  siguientes:
 *  
 *  	* Está formado por dos o más palabras.
 *  	* Cada palabra comienza por una letra mayúscula seguida
 *        de letras minúsculas.
 *      * Cada palabra debería tener al menos dos letras.
 *      * Las palabras se separan entre sí por un único espacio
 *        en blanco.
 *        
 *  El usuario escribirá en la consola una línea que contendrá
 *  varios nombres separados por comas y el programa la leerá,
 *  buscará los nombres y los mostrará de nuevo, cada uno en una línea. 
 * 
 *  Pepe Pérez, Fernando Fernández Fernández, María Martínez
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Pattern p = Pattern.compile("\\p{Lu}\\p{Ll}+(?:\\s\\p{Lu}\\p{Ll}+)+");
		System.out.print("> ");
		String nombres = in.readLine();
		Matcher m = p.matcher(nombres);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
