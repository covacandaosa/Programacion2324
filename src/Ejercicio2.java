import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		float n1, n2, n3, n4, producto, suma, media;
		System.out.print("Introduce cuatro números reales: ");
		n1 = Integer.parseInt(in.readLine());
		n2 = Integer.parseInt(in.readLine());
		n3 = Integer.parseInt(in.readLine());
		n4 = Integer.parseInt(in.readLine());
		producto = n1 * n2 * n3 * n4;
		suma = n1 + n2 + n3 + n4;
		media = suma / 4;
		System.out.println("Producto: " + producto);
		System.out.println("Suma: " + suma);
		System.out.println("media: " + media);
	}

}
