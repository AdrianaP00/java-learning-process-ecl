package appinitial.basico;

import java.util.Scanner;

public class EjercicioScanner {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int numeroLeido;
    
    do {
        System.out.print("Ingresa un número (0 para salir): ");
        numeroLeido = scanner.nextInt();

        if (numeroLeido % 2 != 0) {
            System.out.println("Número impar: " + numeroLeido);
        } else if (numeroLeido  % 2 == 0) {
            System.out.println("Has metido un par");
        }
    } while (numeroLeido != 0);
    
    System.out.println("El programa ha terminado.");
	}
}



