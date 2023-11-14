package appapuestas;

import java.util.Scanner;
import java.util.function.DoubleSupplier;

public class ApuestaV1 {
    private static double apuestaMasAlta = Double.MIN_VALUE;
    private static double apuestaMasBaja = Double.MAX_VALUE;
    private static double sumaApuestas = 0.0;
    private static final int MAX_APUESTAS = 100;
    private static Apuesta[] apuestas = new Apuesta[MAX_APUESTAS];
    private static int numeroApuestas = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarApuestas();
                    break;
                case 2:
                    registrarApuesta(scanner);
                    calcularProbabilidadGanar();
                    break;
                case 3:
                    System.out.println("Apuesta más Alta: " + obtenerApuestaMasAlta.getAsDouble()+ " euros");
                    break;
                case 4:
                    System.out.println("Apuesta más Baja: " + obtenerApuestaMasBaja.getAsDouble() + " euros");
                    break;
                case 5:
                    System.out.println("Media de Apuestas: " + calcularMediaApuestas.getAsDouble() + " euros");
                    break;
                case 6:
                    System.out.println("FIN DE LA APLICACIÓN");
                    break;
                default:
                    System.out.println("Opción no válida. Elija una opción válida.");
                    break;
            }
        } while (opcion != 6);
    }

    public static DoubleSupplier obtenerApuestaMasAlta = () -> apuestaMasAlta;
    public static DoubleSupplier obtenerApuestaMasBaja = () -> apuestaMasBaja;
    public static DoubleSupplier calcularMediaApuestas = () -> (numeroApuestas > 0) ? sumaApuestas / numeroApuestas : 0.0;


    public static void mostrarMenu() {
        System.out.println("Menú de Apuestas");
        System.out.println("1) Mostrar Apuestas");
        System.out.println("2) Registrar Nueva Apuesta");
        System.out.println("3) Mostrar Apuesta más Alta");
        System.out.println("4) Mostrar Apuesta más Baja");
        System.out.println("5) Mostrar Media de Apuestas");
        System.out.println("6) Salir");
        System.out.print("Elija una opción: ");
    }

    public static void mostrarApuestas() {
        if (numeroApuestas < MAX_APUESTAS) {
            System.out.println("Apuestas registradas:");
            for (int i = 0; i < numeroApuestas; i++) {
                System.out.println(apuestas[i]);
            }
        }
    }

    public static void registrarApuesta(Scanner scanner) {
        System.out.print("Nombre del apostador: ");
        String apostador = scanner.nextLine();

        System.out.print("Nombre del equipo local: ");
        String equipoLocal = scanner.nextLine();

        System.out.print("Nombre del equipo visitante: ");
        String equipoVisitante = scanner.nextLine();

        System.out.print("Goles del equipo local: ");
        int golesLocal = scanner.nextInt();

        System.out.print("Goles del equipo visitante: ");
        int golesVisitante = scanner.nextInt();

        System.out.print("Cantidad de la apuesta (en euros): ");
        double cantidadApuesta = scanner.nextDouble();
        boolean isGanada = false;

        apuestaMasAlta = (cantidadApuesta > apuestaMasAlta) ? cantidadApuesta : apuestaMasAlta;
        apuestaMasBaja = (cantidadApuesta < apuestaMasBaja) ? cantidadApuesta : apuestaMasBaja;

        sumaApuestas += cantidadApuesta;

        apuestas[numeroApuestas] = new Apuesta(apostador, equipoLocal, equipoVisitante, golesLocal, golesVisitante,
                cantidadApuesta, isGanada);
        numeroApuestas++;
        System.out.println("Apuesta registrada con éxito.");
    }

    public static void calcularProbabilidadGanar() {
        int apuestasGanadas = 0;
        int apuestasTotales = numeroApuestas;

        for (int i = 0; i < numeroApuestas; i++) {
            if (apuestas[i].isGanada()) {
                apuestasGanadas++;
            }
        }

        if (apuestasTotales > 0) {
            double probabilidad = (double) apuestasGanadas / apuestasTotales * 100.0;
            System.out.println("Probabilidad de ganar: " + probabilidad + "%");
        } else {
            System.out.println("No hay apuestas registradas para calcular la probabilidad.");
        }
    }
}
