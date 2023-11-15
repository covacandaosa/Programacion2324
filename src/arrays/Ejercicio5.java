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
	
}
