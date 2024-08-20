package paseo;
import java.util.Scanner;


public class numBuses {
	
	public static int conteoBus(int numSillasBus, int numEstudiantesGordos, int numEstudiantesFlacos) {
		int numSillasUso = (2* numEstudiantesGordos)+ numEstudiantesFlacos;
		int numBusesNecesarios = (int) Math.ceil((double) numSillasUso/numSillasBus);
		return numBusesNecesarios;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa el valor de numero de sillas: ");
		int s = input.nextInt();
		System.out.println("Ingresa el valor de numero de estudiantes gordos: ");
		int eGordos = input.nextInt();
		System.out.println("Ingresa el valor de numero de estudiantes flacos: ");
		int eFlacos = input.nextInt();
		
		int result = conteoBus(s,eGordos,eFlacos);
		System.out.println("El resultado de la cantidad de buses necesarios para el paseo es  " + result);

	}

}
