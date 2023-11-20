package arrays;

import java.util.Arrays;

public class Ejercicio10 {

	public static void main(String[] args) {
		int [][] m = new int[aleatorio()][aleatorio()];
		for (int i=0; i<m.length; i++)
			for(int j=0; j<m[i].length; j++)
				m[i][j] = (int) Math.round(Math.random() * 1000000);
		System.out.println(Arrays.deepToString(m));
	}
	
	static int aleatorio() {
		return (int) (Math.round(Math.random() * 18) + 2);
	}

	static int [] sumaFilas(int [][] m) {
		int [] v = new int[m.length];
		
		for (int i=0; i<m.length; i++) {
			int suma = 0;
			for (int j=0; j<m[i].length; j++)
				suma += m[i][j];
			v[i] = suma;
		}
		
		return v;
	}
	
	static int [] sumaColumnas(int [][] m) {
		int [] v = new int[m.length];
		for (int j=0; j<m[0].length; j++) {
			int suma = 0;
			for (int i=0; i<m.length; i++)
				suma += m[i][j];
			v[j] = suma;
		}
		
		return v;
	}
}
