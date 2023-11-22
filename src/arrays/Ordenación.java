package arrays;

import java.util.Arrays;

public class Ordenación {

	public static void main(String[] args) {
		int [] v = {10, 3, 9, 5, 7};
		inserciónDirecta(v);
		System.out.println(Arrays.toString(v));
	}
	
	static void inserciónDirecta(int [] v) {
		for (int i=1; i<v.length; i++) {
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

}
