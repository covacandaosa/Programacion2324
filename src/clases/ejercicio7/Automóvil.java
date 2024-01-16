package clases.ejercicio7;

import java.util.Objects;

public class Automóvil {

	private String modelo;
	private float capacidadDeposito;
	private float cantidadCombustible;
	private float consumo;
	private float totalKm;
	private float totalCombustible;
	
	public Automóvil(String modelo, float capacidad,
			float combustible, float consumo) {
		this.modelo = modelo;
		capacidadDeposito = capacidad;
		cantidadCombustible = combustible;
		this.consumo = consumo;
	}
	
	public Automóvil(String modelo, float capacidad, float consumo) {
		this.modelo = modelo;
		capacidadDeposito = cantidadCombustible = capacidad;
		this.consumo = consumo;
	}
	
	public String getModelo() {
		return modelo;
	}

	public float getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public float getCantidadCombustible() {
		return cantidadCombustible;
	}

	public float getConsumo() {
		return consumo;
	}

	public float getTotalKm() {
		return totalKm;
	}

	public float getTotalCombustible() {
		return totalCombustible;
	}

	public void llenarDeposito() {
		cantidadCombustible = capacidadDeposito;
	}
	
	public float llenarDeposito(float litros) {
		float dif = capacidadDeposito - cantidadCombustible;
		if (litros <= dif) {
			cantidadCombustible += litros;
			return 0;
		}
		cantidadCombustible = capacidadDeposito;
		return litros - dif;
	}
	
	public float desplazar(float km) {
		float combustible = km * consumo;
		if (combustible <= cantidadCombustible) {
			totalKm += km;
			totalCombustible += combustible;
			cantidadCombustible -= combustible;
			return combustible;
		}
		return -1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidadCombustible, capacidadDeposito, consumo, modelo, totalCombustible, totalKm);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automóvil other = (Automóvil) obj;
		return Float.floatToIntBits(cantidadCombustible) == Float.floatToIntBits(other.cantidadCombustible)
				&& Float.floatToIntBits(capacidadDeposito) == Float.floatToIntBits(other.capacidadDeposito)
				&& Float.floatToIntBits(consumo) == Float.floatToIntBits(other.consumo)
				&& Objects.equals(modelo, other.modelo)
				&& Float.floatToIntBits(totalCombustible) == Float.floatToIntBits(other.totalCombustible)
				&& Float.floatToIntBits(totalKm) == Float.floatToIntBits(other.totalKm);
	}

	@Override
	public String toString() {
		return "Automóvil [modelo=" + modelo + ", capacidadDeposito=" + capacidadDeposito + ", cantidadCombustible="
				+ cantidadCombustible + ", consumo=" + consumo + ", totalKm=" + totalKm + ", totalCombustible="
				+ totalCombustible + "]";
	}
	
}
