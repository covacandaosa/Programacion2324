package clases.ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PruebaHucha {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Contraseña: ");
		String contraseña = in.readLine();
		System.out.println("Euros: ");
		int euros = Integer.parseInt(in.readLine());
		Hucha h = new Hucha(contraseña, euros);
//		Hucha [] huchas = new Hucha[100];
		ArrayList<Hucha> huchas = new ArrayList<>();
	}
}
