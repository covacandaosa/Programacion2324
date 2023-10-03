import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

//	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		int numero, resultado;
//		System.out.println("Introduzca un número: ");
//		String linea;
//		linea = in.readLine();
//		numero = Integer.parseInt(linea);
//		resultado = numero * 2 * 25;
//		System.out.println("Resultado " + resultado);
//	}

//	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
//		int numero, resultado;
//		System.out.println("Introduzca un número: ");
//		numero = in.nextInt();
//		resultado = numero * 2 * 25;
//		System.out.println("Resultado " + resultado);
//	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numero, resultado;
		System.out.println("Introduzca un número: ");
		numero = Integer.parseInt(in.readLine());
		resultado = numero * 2 * 25;
		System.out.println("Resultado " + resultado);
	}
}
