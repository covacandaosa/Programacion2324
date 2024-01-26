package colecciones.i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio1{
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		Set<String> set = new LinkedHashSet<>();
		for (int i=0; i<n; i++)
			set.add(in.readLine());
		
//		Iterator<String> i = set.iterator();
//		while (i.hasNext())
//			System.out.println(i.next());
		
//		for (String s: set)
//			System.out.println(s);
		
		set.forEach(s -> System.out.println(s));
	}
	
}
