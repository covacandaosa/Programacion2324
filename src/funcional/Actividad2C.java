package funcional;

import java.io.PrintStream;
import java.util.function.BiConsumer;

public class Actividad2C {

	public static void main(String[] args) {
		BiConsumer<PrintStream, Integer> biConsumer = PrintStream::println;
		biConsumer.accept(System.out, 5);
		
		
	}

}
