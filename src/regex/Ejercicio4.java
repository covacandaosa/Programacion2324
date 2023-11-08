package regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 *  Escribe un programa que extraiga todas las URLs que comiencen por
 *  http:// o https:// contenidas en un documento HTML almacenado en un
 *  fichero. La ruta de acceso al fichero se especificará en un parámetro
 *  de línea de comando.
 *  
 */

public class Ejercicio4 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(args[0]);
		Pattern regex = Pattern.compile("");
		try (Scanner s = new Scanner(new File(args[0]))) {
			String url;
			while ((url = s.findWithinHorizon(regex, 0)) != null) {
				System.out.println(url);
			}
		}
	}

}
