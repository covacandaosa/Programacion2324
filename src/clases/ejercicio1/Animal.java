package clases.ejercicio1;

import java.time.LocalDate;

public class Animal {

	public static int numeroDeAnimales;
	
	private String nombre;
	private LocalDate fecha;
	
	public Animal(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public Animal(LocalDate fecha) {
		this("Michi", fecha);
//		nombre = "Michi";
//		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return super.toString() + " Animal [nombre=" + nombre + ", fecha=" + fecha + "]";
	}
	
}
