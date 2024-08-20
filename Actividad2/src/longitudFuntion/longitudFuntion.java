package longitudFuntion;

import java.util.Scanner;

public class longitudFuntion {
	
	public static double funtion(double x, double a) {
		double y = x/Math.sin(Math.toRadians(a));
		return y;
		
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el valor de la altura: ");
		double x = input.nextInt();
		System.out.println("Ingresa el valor del angulo: ");
		double a = input.nextInt();
		
		double result = funtion(x,a);
		System.out.println("El resultado de la longitud " + result);

	}

}
