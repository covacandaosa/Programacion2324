package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio24 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double a = pedirNúmero(in, "Coeficiente a: ");
		double b = pedirNúmero(in, "Coeficiente b: ");
		double c = pedirNúmero(in, "Coeficiente c: ");
		System.out.println("Solución: " + ecuacionSegundoGrado(a, b, c));
	}

	static double ecuacionSegundoGrado(double a, double b, double c) {
		double r1, r2;
		double parcial1 = Math.sqrt(b * b - 4 * a * c);
		double parcial2 = 2 * a;
		r1 = (-b + parcial1) / parcial2;
		r2 = (-b - parcial1) / parcial2;
		return r1;
	}
		
	static double pedirNúmero(BufferedReader in, String mensaje) throws IOException {
		boolean correcto = false;
		double numero = 0;
		System.out.print(mensaje);
		while (!correcto) {
			try {
				numero = Double.parseDouble(in.readLine());
				correcto = true;
			} catch (NumberFormatException e) {
				System.out.print("Incorrecto, inténtalo de nuevo: ");
			}
		}
		return numero;
	}
	
}
