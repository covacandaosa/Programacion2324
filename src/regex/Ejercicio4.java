package regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 *  Escribe un programa que utilice un Scanner para extraer y mostrar todos los hiperenlaces
 *  de un documento HTML almacenado en un fichero cuya ruta de acceso se especificará en un
 *  parámetro de línea de comando, teniendo en cuenta que cada hiperenlace está asignado al
 *  parámetro href de una etiqueta a:
 *  
 *  			<a … href="hiperenlace" …>
 *    
 */

public class Ejercicio4 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(args[0]);
		Pattern regex = Pattern.compile("<a.*?href=\"(.*?)\"");
		try (Scanner s = new Scanner(new File(args[0]))) {
			while (s.findWithinHorizon(regex, 0) != null) {
				System.out.println(s.match().group(1));
			}
		}
	}

}
