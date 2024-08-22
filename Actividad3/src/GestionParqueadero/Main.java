package GestionParqueadero;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
	private static Parqueadero parqueadero = new Parqueadero();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String opcion;
		do {
			opciones();
			opcion = input.nextLine();
			switch(opcion) {
			case "a":
				ingreseVehiculo(input);
				break;
			case "b":
				salidaVehiculo(input);
				break;
			case "c":
				consultaEstado(input);
				break;
			case "d":
				System.out.println("Gracias y buen viaje!");
				break;
			case "e":
				System.out.println("Escoja una opcion valida. Gracias");
				break;
			default: 
				System.out.println("opcion no valida, intente de nuevo. Gracias");
			}
		}while(opcion != "d"); 
		
	}
	
	private static void opciones() {
		System.out.println("OPCIONES");
		System.out.println("a. Ingrese un vehiculo: ");
		System.out.println("b. Registre la salida de vehiculo: ");
		System.out.println("c. Consultar estado: ");
		System.out.println("d. salir: ");
		System.out.println("e. Escoja una opcion");
	}
	
	private static void ingreseVehiculo(Scanner input) {
		System.out.println("Ingrese la placa del vehiculo: ");
		String placa = input.nextLine();
		System.out.println("Ingrese el modelo del vehiculo: ");
		String modelo = input.nextLine();
		System.out.println("Ingrese la marca del vehiculo: ");
		String marca = input.nextLine();
		System.out.println("Ingrese tipo de vehiculo: ");
		String tipoV = input.nextLine();
		Vehiculo vehiculo = null;
		LocalDateTime horaIn = LocalDateTime.now();
		switch(tipoV.toLowerCase()) {
		case "automovil":
            System.out.println("Tarifa Automovil = 3000 por hora");
            System.out.print("Ingrese el tipo de combustible (Gasolina, Diesel, Electrico): ");
            String tipoCombustible = input.nextLine();
            vehiculo = new Automovil(placa, marca, modelo, horaIn, tipoCombustible);
            break;
        case "motocicleta":
            System.out.println("Tarifa Moto = 2000 por hora");
            System.out.print("Ingrese el cilindraje: ");
            int cilindraje = input.nextInt();
            vehiculo = new Moto(placa, marca, modelo, horaIn, cilindraje);
            break;
        case "camion":
            System.out.println("Tarifa Camion = 4000 por hora");
            System.out.print("Ingrese la capacidad de carga en toneladas: ");
            double capacidadCarga = input.nextDouble();
            vehiculo = new Camion(placa, marca, modelo, horaIn, capacidadCarga);
            break;
        default:
            System.out.println("Tipo de vehiculo no valido.");
            return;
    }

    parqueadero.registrarCheckIn(vehiculo);
    System.out.println("Vehiculo ingresado exitosamente." + vehiculo.getCheckIn());

	}
	
	private static void salidaVehiculo(Scanner input) {
		System.out.println("Ingrese la placa del vehiculo para la salida: ");
		String placa = input.nextLine();
	}
	
	private static void consultaEstado(Scanner input) {
		System.out.println("Escribe la placa: ");
		String placa = input.nextLine();
		parqueadero.consultarEstado(placa);
		
		
		
	}

}
