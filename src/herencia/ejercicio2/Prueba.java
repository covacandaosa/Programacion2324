package herencia.ejercicio2;

import herencia.ejercicio1.DVD;
import herencia.ejercicio1.Libro;
import herencia.ejercicio1.Prestable;

public class Prueba {

	public static void main(String[] args) {
		Prestable p = new Libro(1, "El Quijote", 1605, "Cervantes");
		System.out.println(p.estaPrestado());
		p.prestar();
		
		p = new DVD(1, "Dirty Dancing", 1981, 90);
		p.prestar();
		System.out.println(p.estaPrestado());
	}

}
