package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Actividad5 {

	public static void main(String[] args) {
		System.out.println(Stream.of(1, 5, 3, 9, 7).collect(
				Media::new, 
				Media::acumular,
				Media::combinar
		).get());
		
		System.out.println(Stream.of(1, 5, 3, 9, 7).collect(Collectors.averagingInt(n -> n)));
	}
	
}

class Media {
	double acumulador;
	double contador;

	void acumular(double v) {
		acumulador += v;
		contador++;
	}

	void combinar(Media m) {
		System.out.println("combinado: " + this + " con " + m);
		acumulador += m.acumulador;
		contador += m.contador;
		
	}

	double get() {
		return acumulador / contador;
	}

	@Override
	public String toString() {
		return "Media [acumulador=" + acumulador + ", contador=" + contador + "]";
	}

	

}