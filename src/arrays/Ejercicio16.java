package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*

7 6
aabacc
baabcc
hhaacc
hheeab
hgeeef
hgggfe
hhggff
*
2
3

 */

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int filas = s.nextInt();
		int columnas = s.nextInt();
		
		char [][] matriz = new char[filas][columnas]; 
		for (int i=0; i<filas; i++) {
			String linea = s.next();
			for (int j=0; j<linea.length(); j++)
				matriz[i][j] = linea.charAt(j); 
		}
		
//		char [][] matriz = new char[filas][]; 
//		for (int i=0; i<filas; i++)
//			matriz[i] = s.nextLine().toCharArray();
			
		char relleno = s.next().charAt(0);
		int filaInicial = s.nextInt();
		int columnaInicial = s.nextInt();
	
		mostrarMatriz(matriz);
		rellenar(matriz, filaInicial, columnaInicial, matriz[filaInicial][columnaInicial], '*');
		mostrarMatriz(matriz);
		
	
	}
	
	static void rellenar(char [][] matriz, int f, int c, char caracterInicial, char caracterRelleno) {
		matriz[f][c] = caracterRelleno;
		if (c != 0 && matriz[f][c - 1] == caracterInicial)
			rellenar(matriz, f, c - 1, caracterInicial, caracterRelleno);
		if (c != matriz[f].length - 1 && matriz[f][c + 1] == caracterInicial)
			rellenar(matriz, f, c + 1, caracterInicial, caracterRelleno);
		if (f != 0 && matriz[f - 1][c] == caracterInicial)
			rellenar(matriz, f - 1, c, caracterInicial, caracterRelleno);
		if (f != matriz.length - 1 && matriz[f + 1][c] == caracterInicial)
			rellenar(matriz, f + 1, c, caracterInicial, caracterRelleno);
	}
	
	static void mostrarMatriz(char [][] matriz) {
		for (int i=0; i<matriz.length; i++)
			System.out.println(Arrays.toString(matriz[i]));
	}

}
