package dia;
import java.util.Scanner;

public class diaSeguiente {
	
    public static String diaDeManana(String dia) {
        String[] dias = {"lunes", "martes", "miércoles", 
        		"jueves", "viernes", "sábado", "domingo"};

        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(dia)) {
                return dias[(i + 1) % dias.length];
            }
        }
        return "Día inválido";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el nombre de un día: ");
        String dia = input.nextLine();
        String diaManana = diaDeManana(dia);

        System.out.println("El día de mañana es: " + diaManana);

        input.close();
    }
}