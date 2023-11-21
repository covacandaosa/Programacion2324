package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * Programa que utilice un único array para leer y almacenar los datos de varias
 * secuencias de números enteros. Los datos se introducirán por teclado de la forma
 * siguiente:
 * 
 *  • Se escribe una primera línea que contiene el número de secuencias.
 *  • A continuación, se escriben las secuencias a razón de dos líneas por secuencia
 *    con el formato siguiente:
 *     o La primera contiene la cantidad de números de la secuencia.
 *     o La segunda contiene los números de la secuencia separados por espacios.
 *     
 */

/*

3
5
1 2 3 4 5
3
21 31 41
7
1 5 10 15 20 25 30
 
*/

public class Ejercicio11 {

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int [][] a = new int[in.nextInt()][];
//		for (int i=0; i<a.length; i++) {
//			a[i] = new int[in.nextInt()];
//			for (int j=0; j<a[i].length; j++)
//				a[i][j] = in.nextInt();
//		}
//		
//		for (int i=0; i<a.length; i++) {
//			for (int j=0; j<a[i].length; j++)
//				System.out.printf("% 5d  ", a[i][j]);
//			System.out.println();
//		}
//	}

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
//		Scanner in = new Scanner(System.in);
		int [][] a = new int[Integer.parseInt(in.readLine())][];
		for (int i=0; i<a.length; i++) {
			a[i] = new int[Integer.parseInt(in.readLine())];
			String[] in_split = in.readLine().split(" ");
			for (int j=0; j<a[i].length; j++)
				a[i][j] = Integer.parseInt(in_split[j]);
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++)
				System.out.printf("% 5d  ", a[i][j]);
			System.out.println();
		}
	}
}
