package funcional;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Actividad1 {

	public static void main(String[] args) {
		BiConsumer<List<Integer>, Double> biConsumer;
//		biConsumer = (l, n) -> {
//			for (int v: l)
//				if (v > n)
//					System.out.println(v);
//		};
		biConsumer = (l, n) -> l
				.stream().filter(v -> v > n)
				.forEach(System.out::println);
		biConsumer.accept(List.of(1, 2, 3, 4, 5, 6, 7), 3d);
		
//		biConsumer = (l, n) -> {
//			double aux = 0, c = 0;
//			for (int v: l)
//				if (v > n) {
//					aux += v;
//					c++;
//				}
//			System.out.println(aux / c);
//		};
		biConsumer = (l, n) -> System.out.println(l
				.stream().filter(v -> v > n)
				.collect(Collectors.averagingDouble(v -> v)));
		biConsumer.accept(List.of(1, 2, 3, 4, 5, 6, 7), 3d);
		
//		BiFunction<Boolean, Float, Double> biFunction;
//		biFunction = (a, b) -> a ? Math.sqrt(b) : Math.sin(b);
		
		BiFunction<Boolean, Float, Double> biFunction = new BiFunction<>() {
			@Override
			public Double apply(Boolean a, Float b) {
				return a ? Math.sqrt(b) : Math.sin(b);
			}
		};
		
		System.out.println(biFunction.apply(true, 100f));
		System.out.println(biFunction.apply(false, 100f));
		
	}

}
