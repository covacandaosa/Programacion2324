package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Escribe un programa valide un DNI introducido por teclado,
 * sabiendo que existe una correspondencia entre letras del abecedario
 * y un valor numérico resultado de calcular el resto de dividir
 * la parte numérica del DNI entre 23:
 * 
 * 		0 1 2 3 4 5 6 7
 * 		T R W A G M Y F
 * 
 * 		8 9 10 11 12 13 14 15
 * 		P D  X  B  N  J  Z  S
 * 
 *		16 17 18 19 20 21 22
 *		 Q  V  H  L  C  K  E
 * 
 */

public class Ejercicio14 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("DNI: ");
		System.out.println(validarDNI(in.readLine()) ? "correcto" : "incorrecto");
	}
	
	static boolean validarDNI(String dni) {
		int numDNI = Integer.parseInt(dni.substring(0, dni.length() - 1));
		char letraDNI = dni.toUpperCase().charAt(dni.length() - 1);
		return letraDNI == "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numDNI % 23);
	}

}
