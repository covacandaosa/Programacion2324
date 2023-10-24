package ejemplos;

public class OperadorCondicional {

	public static void main(String[] args) {
		
	}
	
//	static double raizCuadradaDelMayor(double a, double b) {
//		double mayor;
//		if (a > b)
//			mayor = a;
//		else
//			mayor = b;
//		return Math.sqrt(mayor);
//	}
	
//	static double raizCuadradaDelMayor(double a, double b) {
//		double mayor = (a > b) ? a : b;
//		return Math.sqrt(mayor);
//	}
	
	static double raizCuadradaDelMayor(double a, double b) {
		return Math.sqrt((a > b) ? a : b);
	}
	
	static double raizCuadradaDelMayorX100(double a, double b) {
		return Math.sqrt((a > b) ? a : b * 100);
	}

}
