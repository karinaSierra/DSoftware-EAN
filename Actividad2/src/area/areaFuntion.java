package area;

import java.util.Scanner;

public class areaFuntion {
	
	public static double calcularAreaCirculo(double radio) {
		return Math.PI * (radio*radio);
	}
	
	public static double calcularAreaCorona(double radioMayor, double radioMenor) {
		return Math.PI * ((radioMayor*radioMayor)-(radioMenor*radioMenor));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el radio menor (r)");
		double radioMenor = input.nextDouble();
		
		System.out.println("Ingrese el radio mayor (R)");
		double radioMayor = input.nextDouble();
		
		double areaCorona = calcularAreaCorona(radioMayor, radioMenor);
		
		System.out.println("El area de la corona es: " + areaCorona);

	}

}
