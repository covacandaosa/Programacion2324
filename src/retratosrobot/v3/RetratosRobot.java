package retratosrobot.v3;

import java.util.Scanner;

public class RetratosRobot {

	/*
	 * Escribir un programa que permita realizar retratos robot (uno o varios sin necesidad de volver
	 * a ejecutarlo) mediante cadenas de caracteres. El programa dará al usuario opción a elegir entre
	 * diferentes posibilidades para el pelo, los ojos, orejas y nariz, y boca:
	 * 
	 * opciones para el pelo				opciones para los ojos		
	 * 
	 *   1. “WWWWWWWWW”						  1. “|  O O  |”
	 *   2. “\\\//////”						  2. “|-(· ·)-|”				  
	 *   3. “|"""""""|”						  3. “|-(o o)-|”
	 *   4. “|||||||||”						  4. “|  \ /  |”
	 *   
	 * opciones para orejas y nariz			opciones para la boca
	 *   
	 *   1. “@   J   @”						  1. “|  ===  |”
	 *   2. “{   "   }”						  2. “|   -   |”	
	 *   3. “[   j   ]”						  3. “|  ___  |”
	 *   4. “<   -   >”						  4. “|  ---  |”							
	 *
	 * opciones para la barbilla
	 * 
	 *   1. “ \_____/ ”
	 *   2. “ \,,,,,/ ”
	 * 
	 */
	
	public static void main(String[] args) {
		String [][] opciones = {
				{"el pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
				{"los ojos", "|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\ /  |"},
				{"las orejas y nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
				{"la boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
				{"la barbilla", " \\_____/ ", " \\,,,,,/ "}
		};
		int [] retrato = new int[opciones.length];
		for (int i=0; i<retrato.length; i++)
			retrato[i] = pedirOpcion(opciones[i]);
		for (int i=0; i<retrato.length; i++)
			System.out.println(opciones[i][retrato[i]]);
	}
	
	static Scanner in = new Scanner(System.in);
	
	static int pedirOpcion(String [] opciones) {
		System.out.println("Elige una opción para " + opciones[0]);
		for (int i = 1; i < opciones.length; i++)
			System.out.println(i + ". " + opciones[i]);
		int opcion;
		do {
			System.out.println("opción: ");
			opcion = in.nextInt();
			if (opcion < 1 || opcion >= opciones.length)
				System.out.println("opción incorrecta, inténtalo de nuevo...");
		} while(opcion < 1 || opcion >= opciones.length);
		return opcion;
	}

}
