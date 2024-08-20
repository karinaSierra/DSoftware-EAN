package ejeCartesiano;
import java.util.Scanner;


public class puntosCartesianos {

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa la coordenada x1: ");
        double x1 = input.nextDouble();
        System.out.println("Ingresa la coordenada y1: ");
        double y1 = input.nextDouble();


        System.out.println("Ingresa la coordenada x2: ");
        double x2 = input.nextDouble();
        System.out.println("Ingresa la coordenada y2: ");
        double y2 = input.nextDouble();

        double distancia = calcularDistancia(x1, y1, x2, y2);
        double pendiente = calcularPendiente(x1, y1, x2, y2);

        System.out.println("La distancia entre los dos puntos es: " + distancia);
        System.out.println("La pendiente de la recta que une los dos puntos es: " + pendiente);

        input.close();
    }
}