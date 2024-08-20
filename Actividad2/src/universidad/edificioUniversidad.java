package universidad;
import java.util.Scanner;

public class edificioUniversidad {
	
    public static int calcularNumSalos(int numEstudiantes, int capacidadSalon) {
    	return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }
    
    public static int calcularNumPisos(int numSalones, int salonesPorPiso) {
    	return (int) Math.ceil((double) numSalones / salonesPorPiso);
    }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de estudiantes: ");
		int numEstudiantes = input.nextInt();
		
		System.out.println("Ingresa la capacidad de un salón: ");
		int capacidadSalon = input.nextInt();
		
		System.out.println("Ingresa el numero de salones por piso: ");
		int salonesPorPiso = input.nextInt();
		
		int numSalones = calcularNumSalos(numEstudiantes, capacidadSalon);
		int numPisos = calcularNumPisos(numSalones, salonesPorPiso);
		
		System.out.println("El numero de salones necesarios es: " +  numSalones);
		System.out.println("El numero de pisos necesarios es: " +  numPisos);
		
		input.close();

	}
}
