package colecciones.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Set<String> seRepiten = new HashSet<>();
		Set<String> sinRepetir = new HashSet<>();
		
		System.out.print("Texto: ");
		Matcher m = Pattern.compile("\\S+").matcher(in.readLine());
		while (m.find()) {
			String palabra = m.group();
//			if (sinRepetir.contains(palabra)) {
//				sinRepetir.remove(palabra);
//				seRepiten.add(palabra);
//			}
//			else
//				sinRepetir.add(palabra);
			if (!sinRepetir.add(palabra)) {
				sinRepetir.remove(palabra);
				seRepiten.add(palabra);
			};
		}
		System.out.println("Repetidas: " + seRepiten);
		System.out.println("No repetidas: " + sinRepetir);
	}
	
}
