package naipes.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackJackConsola {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BlackJack bj = new BlackJack(6);
		String respuesta;
		
		System.out.print("Repartir (r) o Salir (s): ");
		while (!(respuesta = in.readLine()).equalsIgnoreCase("s")) {
			if (respuesta.equalsIgnoreCase("r")) {
				bj.repartir();
				System.out.println(bj);
				while (bj.manoEnCurso()) {
					System.out.println("Pedir (+) o plantarse (p): ");
					switch (in.readLine()) {
					case "+":
						bj.pedir();
						break;
					case "p":
						bj.plantarse();
						break;
					default:
						System.out.println("Opción incorrecta");
					}
					System.out.println(bj);
				}
			}
			else
				System.out.println("Opción incorrecta");
			System.out.print("Repartir (r) o Salir (s): ");
		}
	}

}
