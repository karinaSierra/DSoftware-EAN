package Sueldo;

import java.util.Scanner;

public class sueldoMes {
	
	public static double calculaGastoArriendo(double sueldoArriendo) {
		double arriendo =  sueldoArriendo*0.40;
		return arriendo;
	}
	
	public static double calculaGastoComida(double sueldoComida) {
		double comida = sueldoComida*0.15;
		return comida;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa el sueldo de Pedro: ");
        double sueldo = input.nextDouble();
        
		double gastoArriendo = calculaGastoArriendo(sueldo);
		System.out.println("Gasto en arriendo: " + gastoArriendo);
		
		double gastoComida = calculaGastoComida(sueldo);
		System.out.println("Gasto en comida: " + gastoComida);
		
		double dineroRestante = sueldo - (gastoArriendo + gastoComida);
		System.out.println("Dinero restante: " + dineroRestante);

	}

}
