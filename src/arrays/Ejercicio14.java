package arrays;

import java.util.Arrays;

public class Ejercicio14 {

	public static void main(String[] args) {
		int [] v1 = Ejercicio05.rellenarSinRepetir(3, 5, 1, 999);
		int [] v2 = Ejercicio05.rellenarSinRepetir(3, 5, 1, 999);
		int [] v3 = new int[v1.length + v2.length];
		Arrays.sort(v1);
		Arrays.sort(v2);
		
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		while (i1 < v1.length && i2 < v2.length) {
			if (v1[i1] > v2[i2]) {
				v3[i3] = v2[i2];
				i2++;
			}
			else {
				v3[i3] = v1[i1];
				i1++;
			}
			i3++;
		}
		if (i1 < v1.length) {
			for (; i1<v1.length; i1++, i3++)
				v3[i3] = v1[i1]; 
		}		
		else if (i2 < v2.length) {
			for (; i2<v2.length; i2++, i3++)
				v3[i3] = v2[i2]; 
		}		
		
		System.out.println(Arrays.toString(v1));
		System.out.println(Arrays.toString(v2));
		System.out.println(Arrays.toString(v3));
	}

}
