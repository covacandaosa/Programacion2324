package funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Actividad2B {

	public static void main(String[] args) {
		List<Double> l = new ArrayList<>();
		BiConsumer<Integer, Double> biConsumer = l::add;
		biConsumer.accept(0, 5.5);
		System.out.println(l);
		
		String s = "Hola Mundo";
		BiFunction<Integer, Integer, String> biFunction = s::substring;
		System.out.println(biFunction.apply(2, 5));
		
	}

}
