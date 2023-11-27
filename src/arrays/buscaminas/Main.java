package arrays.buscaminas;

import java.util.Random;

public class Main {

	static Random r = new Random();
	
	public static void main(String[] args) {
		int [][] tablero = crearTablero(10, 20, 1, 1);
		mostrarTablero(tablero);
	}

	/*
	 * filas: número de filas del tablero
	 * columnas: número de columnas del tablero
	 * minas: número de minas
	 * tablero[fil][col]: casilla en la que no se puede colocar una mina
	 * 
	 * Crea el tablero y coloca el número de minas especificado de forma aleatoria
	 */
	static int [][] crearTablero(int filas, int columnas, int fil, int col) {
		int [][] tablero = new int[filas][columnas];
		int numMinas = (int) (0.15 * (filas * columnas));
		while (numMinas > 0) {
			int i = r.nextInt(filas);
			int j = r.nextInt(columnas);
			if (tablero [i][j] != -1 && (i != fil || j != col)) {
				tablero [i][j] = -1;
				numMinas--;
			}
		}
		for (int i=0; i<tablero.length; i++)
			for (int j=0; j<tablero[i].length; j++) {
				if (tablero[i][j] != -1) {
					int cont = 0;
					for (int k=i-1; k<=i+1; k++)
						for (int l=j-1; l<=j+1; l++)
							if (k >= 0 && k < tablero.length && l >= 0 && l < tablero[i].length && tablero[k][l] == -1)
								cont++;
					tablero[i][j] = cont;
				}
			}
		
		return tablero;
	}
	
	static void mostrarTablero(int [][] tablero) {
		for (int i=0; i<tablero.length; i++) {
			for (int j=0; j<tablero[i].length; j++)
				System.out.print(tablero[i][j] == -1 ? "*" : tablero[i][j]);
			System.out.println();
		}
	}
	
}
