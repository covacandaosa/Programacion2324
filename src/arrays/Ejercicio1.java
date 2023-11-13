package arrays;

import java.util.Scanner;

/*
 * Programa que, utilizando una cantidad mínima de variables, simule el lanzamiento
 * de un dado N veces, siendo N un número entero que se introducirá por teclado.
 * Antes de finalizar mostrará el número de veces que salió cada una de las caras.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Número de tiradas: ");
			int n = in.nextInt();
			int [] contadores = new int [6];
			for (int i = 0; i < n; i++)
				contadores[(int) Math.round(Math.random() * 5)]++;
			for (int i = 0; i < contadores.length; i++)
				System.out.printf("La cara %d ha salido %d veces\n", i + 1, contadores[i]);
		}
	}

}
