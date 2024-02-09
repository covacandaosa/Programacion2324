package funcional;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class Actividad2A {

	public static void main(String[] args) {
		BiConsumer<int [],Integer> biConsumer = Arrays::fill;
		int[] a = new int[10];
		biConsumer.accept(a, 5);
		System.out.println(Arrays.toString(a));
		
		BiFunction<Character, Character, Integer> biFunction = Character::toCodePoint;
		System.out.println(biFunction.apply('a', 'b'));
		
		BinaryOperator<Double> binaryOperator = Math::max;
		System.out.println(binaryOperator.apply(3d, 30d));
		
		BiPredicate<int[], int[]> biPredicate = Arrays::equals;
		System.out.println(biPredicate.test(new int[]{1, 2}, new int[]{1,2}));
		
	}

}
