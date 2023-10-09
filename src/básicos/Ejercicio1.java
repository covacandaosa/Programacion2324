package básicos;

/*
 * Escribir y ejecutar un programa que
 * imprima el nombre, edad y
 * dirección del alumno.
 * 
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Nombre: Julio\nEdad: 56\nDirección: Cuero");
		
		System.out.println("Nombre: Julio");
		System.out.println("Edad: 56");
		System.out.println("Dirección: Cuero");
		
		String nombre = "Julio";
		int edad = 56;
		String dirección = "Cuero";
		
		System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nDirección: " + dirección);
		
		System.out.printf("Nombre: %s\nEdad: %10.2f\nDirección: %s", nombre, (float) edad, dirección);
	}

}
