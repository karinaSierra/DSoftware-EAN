package terreno;
import java.util.Scanner;

public class terreno {
	
	public static double areas(double base, double altura) {
		return base * altura;
	}
	
	public static double calcularHipotenusa(double cateto1, double cateto2) {
		return Math.sqrt((cateto1*cateto1)+(cateto2*cateto2));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el valor de A: ");
		double A = input.nextDouble();
		
		System.out.println("Ingresa el valor de B: ");
		double B = input.nextDouble();
		
		System.out.println("Ingresa el valor de c: ");
		double C = input.nextDouble();
		
		double areaRect = areas(B,C);
		double hipotenusa = calcularHipotenusa(A-C, B);
		double areaTri = areas(B, A-C)/2;
		double perimetro = (A + B + C + hipotenusa);
		
		System.out.println("El area del rectangulo es: " + areaRect);
		System.out.println("La hipotenusa es: " + hipotenusa);
		System.out.println("El area del tringulo es: " + areaTri);
		System.out.println("El perimetro es: " + perimetro);
		
		input.close();
	}

}
