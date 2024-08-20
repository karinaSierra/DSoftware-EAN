package hermanoM;
import java.util.Scanner;

public class hermanoMayor {
	
	 public static String obtenerHermanoMayor(String nombre1, int edad1, 
			String nombre2, int edad2, String nombre3, int edad3) {
	        String mayor = nombre1;
	        int maxEdad = edad1;

	        if (edad2 > maxEdad) {
	            mayor = nombre2;
	            maxEdad = edad2;
	        }

	        if (edad3 > maxEdad) {
	            mayor = nombre3;
	        }

	        return mayor;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Ingresa el nombre del primer hermano: ");
	        String nombre1 = input.nextLine();
	        
	        System.out.print("Ingresa la edad del primer hermano: ");
	        int edad1 = input.nextInt();
	        input.nextLine(); 
	        
	        System.out.print("Ingresa el nombre del segundo hermano: ");
	        String nombre2 = input.nextLine();
	        
	        System.out.print("Ingresa la edad del segundo hermano: ");
	        int edad2 = input.nextInt();
	        input.nextLine(); 
	        
	        System.out.print("Ingresa el nombre del tercer hermano: ");
	        String nombre3 = input.nextLine();
	        
	        System.out.print("Ingresa la edad del tercer hermano: ");
	        int edad3 = input.nextInt();

	        String hermanoMayor = obtenerHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

	        System.out.println("El hermano mayor es: " + hermanoMayor);

	        input.close();
	    }
	}
