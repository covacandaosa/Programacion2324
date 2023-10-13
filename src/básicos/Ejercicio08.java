package básicos;

import java.io.IOException;
import java.util.Scanner;

/*
 * Escribe un programa que permita convertir las componentes de un
 * color en el espacio RGB a sus componentes en el espacio YIQ,
 * según las expresiones matemáticas siguientes:
 * 
 * 		𝑦 = 0,299𝑟 + 0,587𝑔 + 0,114𝑏
 * 		𝑖 = 0,596𝑟 − 0,275𝑔 − 0,321𝑏
 * 		𝑞 = 0,212𝑟 − 0,528𝑔 + 0,311𝑏
 * 
 * El usuario introducirá por teclado el valor de cada componente RGB
 * (rojo, verde y azul)
 * 
 */

public class Ejercicio08 {

//	public static void main(String[] args) throws IOException {
//		float r, g, b, y, i, q;
//		String línea;
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("R: ");
//		línea = in.readLine();
//		r = Float.parseFloat(línea);
//		System.out.println("G: ");
//		línea = in.readLine();
//		g = Float.parseFloat(línea);
//		System.out.println("B: ");
//		línea = in.readLine();
//		b = Float.parseFloat(línea);
//		y = 0.299f * r + 0.587f * g + 0.114f * b;
//		i = 0.596f * r - 0.275f * g - 0.321f * b;
//		q = 0.212f * r - 0.528f * g + 0.311f * b;
//		System.out.println("y: " + y);
//		System.out.println("i: " + i);
//		System.out.println("q: " + q);
//	}
	
	public static void main(String[] args) throws IOException {
		float r, g, b, y, i, q;
		Scanner in = new Scanner(System.in);
		System.out.println("RGB: ");
		r = in.nextFloat();
		g = in.nextFloat();
		b = in.nextFloat();
		y = 0.299f * r + 0.587f * g + 0.114f * b;
		i = 0.596f * r - 0.275f * g - 0.321f * b;
		q = 0.212f * r - 0.528f * g + 0.311f * b;
		System.out.println("y: " + y);
		System.out.println("i: " + i);
		System.out.println("q: " + q);
		in.close();
	}

}
