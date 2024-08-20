package calculadora;
import java.util.Scanner;

public class calculadora {
	
	public static double calcular(double num1, double num2, String operador) {
		switch(operador) {
		case "+": return num1 + num2;
		case "-": return num1 - num2;

		case "*": return num1 * num2;
		case "/":
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
                return 0; 
            }
            return num1 / num2;
		case "%": return num1 % num2;
		case "**": return Math.pow(num1, num2); 
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero: ");
		double num1 = input.nextDouble();
		
		System.out.println("Ingresa el segundo numero: ");
		double num2 = input.nextDouble();
		
		System.out.println("Ingresa el operador aritmetico (+, -, *, /, %, **): ");
		String operador = input.next();
		
		double res = calcular(num1, num2, operador);
		
		System.out.println("El resultado de " + num1 + " " + operador + " " + num2 + " es: " + res);
		
		input.close();

	}
}