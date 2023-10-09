package básicos;

import java.io.IOException;
import java.util.Scanner;

/*
 * Escribe un programa que convierta de euros a dólares. El resultado de
 * la conversión se mostrará en la salida estándar con una precisión de 2
 * decimales.
 * 
 */

public class Ejercicio3 {

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		System.out.print("Euros: ");
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		float euros = Float.parseFloat(in.readLine());
//		System.out.printf("%.2f euros = %.2f dolares", euros, euros * 1.06f);
//	}
	
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		System.out.print("Euros: ");
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		float euros = Float.parseFloat(in.readLine());
//		float dolares = euros * 1.06f;
//		System.out.printf("%.2f euros = %.2f dolares", euros, dolares);
//	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Euros: ");
		Scanner in = new Scanner(System.in);
		float euros = in.nextFloat();
		float dolares = euros * 1.06f;
		System.out.printf("%.2f euros = %.2f dolares", euros, dolares);
	}

}
