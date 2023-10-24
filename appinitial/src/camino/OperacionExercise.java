package camino;

import java.util.Scanner;

public class OperacionExercise {

	public static boolean esNumeroImpar(int n) {
		boolean impar = false;
		if (n % 2 == 1) {
			impar = false;
		}
		return impar;
	}
	
//	public static int suma(int[] x , int[] y) {
////		int sum =  x + y;
//		return sum;
//	}
	
	public static void comparadorDeNumeros( int x , int y) {
        int x1 = 0;
        int y1 = 0;
        
        if(x1 < y1) {
        	System.out.println("el numero mayor es" + y1 );
        } else {
        	System.out.println("el numero mayor es" + x1 );
        }
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		int impares = 0;
		int suma = 0;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.println("Por favor, ingresa 10 números:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = input.nextInt();

			if (esNumeroImpar(numeros[i])) {
				impares++;
			}

			suma(numeros[i]);

			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}

			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		double media = (double) suma / 10;

		System.out.println("Los números ingresados son:");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}

		System.out.println("\nCantidad de números impares: " + impares);
		System.out.println("La suma de los números ingresados es: " + suma);
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
		System.out.println("La media de los números es: " + media);
	}
}
