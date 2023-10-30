package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Escribe un programa que lea una frase de teclado e indique si es
 * palíndroma, esto es, que se lee igual de derecha a izquierda que
 * de izquierda a derecha sin tener en cuenta los espacios ni las 
 * tildes.
 * 
 * Ejemplos:
 * 
 * 		Seres, ¡somos seres!
 * 		La tele letal.
 * 		¿Nadan o no nadan?
 * 		Amigo, no gima.
 * 		A mí me mima.
 * 		Ana lleva al oso la avellana.
 * 		Arriba la birra.
 * 		Amar da drama.
 * 
 */

public class Ejercicio33 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Frase: ");
		String frase = in.readLine();
		Pattern pattern = Pattern.compile("[^a-zñÑáÁéÉíÍóÓúÚüÜ]+");
		Matcher matcher = pattern.matcher(frase.toLowerCase());
		String frase2 = matcher.replaceAll("");
		System.out.println(frase2);
		boolean palindromo = true;
		int n = frase2.length() / 2;
		int i = 0;
		while (i++ < n && palindromo)
			palindromo = frase2.charAt(i) == frase2.charAt(frase2.length() - i - 1);
		System.out.println(palindromo);
	}

}
