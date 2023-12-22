package arrays;

import java.util.Scanner;

/*
4 5 
1 5 5 2 4
2 1 4 14 3
3 7 11 2 8
4 8 12 16 4
  
 */

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int filas = s.nextInt();
		int columnas = s.nextInt();
		
		int [][] matriz = new int[filas][columnas]; 
		for (int i=0; i<filas; i++) 
			for (int j=0; j<columnas; j++)
				matriz[i][j] = s.nextInt();
		
		System.out.println(max3x3sum(matriz));
	}
	
	static int max3x3sum(int [][] matriz) {
		int max = Integer.MIN_VALUE;
		if (matriz.length < 3 || matriz[0].length < 3)
			throw new IllegalArgumentException();
		for (int i=0; i<=matriz.length - 3; i++)
			for (int j=0; j<=matriz[i].length - 3; j++) {
				int suma = 0;
				for (int ii=i; ii<i+3; ii++)
					for (int jj=j; jj<j+3; jj++)
						suma += matriz[ii][jj];
				if (suma > max)
					max = suma;
			}
		return max;
	}

}
