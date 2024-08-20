package mayorNumero;

import java.util.Scanner;

public class mayorNum {
	
	public static int encontrarMayor(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero: ");
		int numero1 = input.nextInt();
		
		System.out.println("Ingresa el segundo numero: ");
		int numero2 = input.nextInt();
		
		int mayor = encontrarMayor(numero1, numero2);
		
		System.out.println("El mayor numero es: " + mayor);
		
		input.close();

	}
}
