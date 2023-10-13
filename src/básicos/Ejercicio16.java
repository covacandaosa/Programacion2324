package básicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * Escribir un programa que realice un juego que consiste en acertar un
 * número desconocido generado aleatoriamente entre uno y cien.
 * Para ello se leerán de teclado números, y se compararán con el
 * número secreto, indicando si son mayores o menores que este, hasta
 * acertar.
 * 
 */

public class Ejercicio16 {

//	public static void main(String[] args) throws IOException {
//		Random r = new Random();
//		int n_aleatorio = r.nextInt(100) + 1;
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int n_usuario;
//		do {
//			System.out.println("Dime un número entre 1 y 100: ");
//			n_usuario = Integer.parseInt(in.readLine());
//			if (n_usuario == n_aleatorio) {
//				System.out.println("Enhorabuena, has acertado!");
//			}
//			else {
//				if (n_usuario < n_aleatorio)
//					System.out.println("Tu número es menor");
//				else
//					System.out.println("Tu número es mayor");
//			}
//		} while (n_usuario != n_aleatorio);
//	}
	
//	public static void main(String[] args) throws IOException {
//		Random r = new Random();
//		int n_aleatorio = r.nextInt(100) + 1;
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int n_usuario;
//		System.out.print("Dime un número entre 1 y 100: ");
//		n_usuario = Integer.parseInt(in.readLine());
//		while (n_usuario != n_aleatorio){
//			if (n_usuario < n_aleatorio) {
//				System.out.println("Tu número es menor");
//			}
//			else {
//				System.out.print("Tu número es mayor");
//			}
//			System.out.println("Dime otro número entre 1 y 100: ");
//			n_usuario = Integer.parseInt(in.readLine());
//		} 
//		System.out.println("Enhorabuena, has acertado!");
//	}
	
	public static void main(String[] args) throws IOException {
		int n_aleatorio = (int) (Math.random() * 100) + 1;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n_usuario;
		System.out.print("Dime un número entre 1 y 100: ");
		n_usuario = Integer.parseInt(in.readLine());
		while (n_usuario != n_aleatorio){
			if (n_usuario < n_aleatorio) {
				System.out.println("Tu número es menor");
			}
			else {
				System.out.print("Tu número es mayor");
			}
			System.out.println("Dime otro número entre 1 y 100: ");
			n_usuario = Integer.parseInt(in.readLine());
		} 
		System.out.println("Enhorabuena, has acertado!");
	}
	
//	public static void main(String[] args) throws IOException {
//		int n_aleatorio = (int) (Math.random() * 100) + 1;
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int n_usuario;
//		System.out.print("Dime un número entre 1 y 100: ");
//		n_usuario = Integer.parseInt(in.readLine());
//		for (;n_usuario != n_aleatorio;){
//			if (n_usuario < n_aleatorio) {
//				System.out.println("Tu número es menor");
//			}
//			else {
//				System.out.print("Tu número es mayor");
//			}
//			System.out.println("Dime otro número entre 1 y 100: ");
//			n_usuario = Integer.parseInt(in.readLine());
//		} 
//		System.out.println("Enhorabuena, has acertado!");
//	}

}
