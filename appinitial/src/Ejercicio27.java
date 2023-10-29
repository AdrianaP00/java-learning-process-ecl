import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 1
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);
        boolean pertenece = caracterPertenece(cadena, caracter);
        System.out.println("El carácter pertenece a la cadena: " + pertenece);

        // Ejercicio 2
        int contador = contarCaracteres(cadena, caracter);
        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
        
        // Ejercicio 3
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        boolean esPar = esPar(numero);
        System.out.println("El número es par: " + esPar);
        
        // Ejercicio 4
        boolean esMayorDeEdad = esMayorDeEdad();
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        
        // Ejercicio 5
        System.out.print("Ingrese una nota (0-10): ");
        int nota = scanner.nextInt();
        String calificacion = obtenerCalificacion(nota);
        System.out.println("Calificación: " + calificacion);
        
        // Ejercicio 6
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.next();
        String textoReverso = cadenaAlReves(texto);
        System.out.println("Cadena al revés: " + textoReverso);
        
        // Ejercicio 7
        mostrarSecuencia();
    }

    // Ejercicio 1
    public static boolean caracterPertenece(String cadena, char caracter) {
        return cadena.contains(String.valueOf(caracter));
    }

    // Ejercicio 2
    public static int contarCaracteres(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    // Ejercicio 3
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Ejercicio 4
    public static boolean esMayorDeEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        return edad >= 18;
    }

    // Ejercicio 5
    public static String obtenerCalificacion(int nota) {
        if (nota < 0 || nota > 10) {
            return "Nota no válida";
        } else if (nota < 4) {
            return "Suspenso";
        } else if (nota < 5) {
            return "Aprobado";
        } else if (nota < 7) {
            return "Bien";
        } else if (nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    // Ejercicio 6
    public static String cadenaAlReves(String texto) {
        StringBuilder reverso = new StringBuilder(texto);
        return reverso.reverse().toString();
    }

    // Ejercicio 7
    public static void mostrarSecuencia() {
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
