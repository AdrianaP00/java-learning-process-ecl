package camino;

import java.util.Scanner;

public class OperacionExercise {

    public static boolean esNumeroImpar(int n) {
        return n % 2 == 1;
    }

    public static int suma(int[] numeros) {
        int sum = 0;
        for (int numero : numeros) {
            sum += numero;
        }
        return sum;
    }

    public static int encontrarMayor(int[] numeros) {
        int mayor = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public static double calcularMedia(int[] numeros) {
        int suma = suma(numeros);
        return (double) suma / numeros.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int impares = 0;

        System.out.println("Por favor, ingresa 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = input.nextInt();

            if (esNumeroImpar(numeros[i])) {
                impares++;
            }
        }

        int suma = suma(numeros);
        int mayor = encontrarMayor(numeros);
        int menor = encontrarMenor(numeros);
        double media = calcularMedia(numeros);

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
