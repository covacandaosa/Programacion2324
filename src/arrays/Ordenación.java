package arrays;

import java.util.Arrays;

public class Ordenación {

	public static void main(String[] args) {
		int [] v = {10, 3, 9, 5, 7};
//		inserciónDirecta(v);
//		selecciónDirecta(v);
		intercambioDirecto(v);
		System.out.println(Arrays.toString(v));
	}
	
	static void inserciónDirecta(int [] v) {
		for (int i = 1; i < v.length; i++) {
			int j = 0;
			while (j < i && v[j] < v[i])
				j++;
			if (j < i) {
				int aux = v[i];
				for (int k = i - 1; k >= j; k--)
					v[k + 1] = v[k];
				v[j] = aux;
			}
		}
	}
	
	static void selecciónDirecta(int [] v) {
		for (int i = 0; i < v.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < v.length; j++)
				if (v[j] < v[min])
					min = j;
			if (min != i) {
				int aux = v[i];
				v[i] = v[min];
				v[min] = aux;
			}
		}
	}
	
	static void intercambioDirecto(int [] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = v.length - 1; j > i; j--)
				if (v[j] < v[j - 1]) {
					int aux = v[j];
					v[j] = v[j - 1];
					v[j - 1] = aux;
				}
		}
	}

}
