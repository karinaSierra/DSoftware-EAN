package algebraFuction;

import java.util.Scanner;

public class AlgebraFunction {
	
	public static int funtion(int x, int y) {
		int res = (x*x)+(2*x*y)+(y*y);
		return res;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el valor de X: ");
		int x = input.nextInt();
		System.out.println("Ingresa el valor de Y: ");
		int y = input.nextInt();
		
		int result = funtion(x,y);
		System.out.println("El resultado de f " + result);
	}
	
	
	
}