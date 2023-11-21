package arrays;

public class Ejercicio10 {

	public static void main(String[] args) {
		int [][] m = new int[aleatorio(2, 20)][aleatorio(2, 20)];
		for (int i=0; i<m.length; i++)
			for(int j=0; j<m[i].length; j++)
				m[i][j] = (int) Math.round(aleatorio(0, 999));
		int [] v1 = sumaFilas(m);
		int [] v2 = sumaColumnas(m);
		mostrarResultados(m, v1, v2);
	}
	
	static int aleatorio(int min, int max) {
		return (int) (Math.round(Math.random() * max - min) + min);
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
		int [] v = new int[m[0].length];
		for (int j=0; j<m[0].length; j++) {
			int suma = 0;
			for (int i=0; i<m.length; i++)
				suma += m[i][j];
			v[j] = suma;
		}
		
		return v;
	}
	
	static void mostrarResultados(int [][] m, int [] v1, int [] v2) {
		for (int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++)
				System.out.printf("% 5d  ", m[i][j]);
			System.out.printf("= % 5d\n", v1[i]);
		}
		for (int i=0; i<v2.length; i++)
			System.out.printf("% 5d  ", v2[i]);
	}
}
