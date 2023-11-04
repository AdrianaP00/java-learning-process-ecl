import java.util.ArrayList;
import java.util.Collections;

public class MainArray {

	public static void main(String[] args) {

		// TODO haced un main, que recibe
		// una serie de argumentos
		// y me imprima el argumento de mayor longitud
		if (args.length == 0) {
			System.out.println("No se han proporcionado argumentos.");
			return;
		}
		String argumentoMasLargo = args[0];
		ArrayList<String> argumentosIguales = new ArrayList<>();
		String argumentoMasLargos = args[0];

		for (int i = 1; i < args.length; i++) {
			if (args[i].length() > argumentoMasLargo.length()) {
				argumentoMasLargo = args[i];
				argumentosIguales.clear();
			} else if (args[i].length() == argumentoMasLargo.length()) {
				argumentosIguales.add(args[i]);
			}
			if (!argumentosIguales.isEmpty()) {
				Collections.sort(argumentosIguales);
				System.out.println("Argumentos de la misma longitud ordenados alfabéticamente: " + argumentosIguales);
				System.out.println("El argumento más largo es: " + argumentoMasLargo);
				System.out.println("Longitude: " + argumentoMasLargo.length());
			}

		}
	}
}