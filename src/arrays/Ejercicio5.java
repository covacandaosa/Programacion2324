package arrays;

public class Ejercicio5 {

	public static int [] rellenarSinRepetir(int tamMin, int tamMax, int min, int max) {
		int [] v = new int[(int) Math.round(Math.random() * (Math.abs(tamMax - tamMin) + 1) - min)];
		rellenarSinRepetir(v, min, max);
		return v;
	}
	
	public static int [] rellenarSinRepetir(int tam, int min, int max) {
		int [] v = new int[tam];
		rellenarSinRepetir(v, min, max);
		return v;
	}
	
	public static void rellenarSinRepetir(int [] v, int min, int max) {
		int i=0;
		while (i < v.length) {
			int n = (int) Math.round(Math.random() * (Math.abs(max - min) + 1) - min);
			int j = 0;
			while (j < i && v[j++] != n);
			if (j == i)
				v[i++] = n;
		}
	}
	
	public static int [] crearInverso(int [] v) {
		int [] vInverso = new int[v.length];
		for (int i = v.length - 1; i >= 0; i--)
			vInverso[v.length - 1 - i] = v[i];
		return vInverso;
	}
	
	public static int buscarMaximo(int[] v) {
		int maximo=v[0];
		for (int i=1; i<v.length; i++) {
			if (v[i]>maximo) {maximo=v[i];}
		}
		return maximo;
	}
	
	public static double calculadorMedia (double[] v) {
		double media = v[0];
		for (int i=1; i<v.length; i++ )
			media += v[i];
		return media / v.length;
	}
		
	public static int contadorAlgos (String [] v, String algos) {
		int n = 0;
		for (int i=0; i<v.length; i++ ) {
			if (v[i].indexOf(algos)) {
				n += 1;
			}
		}
		return n; 
	}
}
	

