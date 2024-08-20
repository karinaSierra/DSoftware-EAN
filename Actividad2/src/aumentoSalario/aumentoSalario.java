package aumentoSalario;
import java.util.Scanner;

public class aumentoSalario {

	public static double calcularAumento(double sueldoActual) {
        double aumento;
        if (sueldoActual <= 800000) {
            aumento = sueldoActual * 0.10;
        } else if (sueldoActual <= 1200000) {
            aumento = sueldoActual * 0.08;
        } else {
            aumento = sueldoActual * 0.05;
        }
        return aumento;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el sueldo actual del empleado: ");
        double sueldoActual = input.nextDouble();
        double aumento = calcularAumento(sueldoActual);
        double nuevoSueldo = sueldoActual + aumento;

        System.out.println("El valor del aumento es: " + aumento);
        System.out.println("El nuevo sueldo del empleado es: " + nuevoSueldo);

        input.close();
    }
}
