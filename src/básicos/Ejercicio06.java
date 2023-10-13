package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Construir un programa que calcule el perímetro y el área de una
 * circunferencia leyendo su radio por teclado. (π = 3.14159)
 * 
 */

public class Ejercicio06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double radio;
		double perímetro;
		double área;
		System.out.println("Radio: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String línea = in.readLine();
		radio = Double.parseDouble(línea);
		perímetro = 2 * Math.PI * radio;
		System.out.println("Perímetro: " + perímetro);
		área = Math.PI * radio * radio;
		System.out.println("Área: " + área);
	}

}
