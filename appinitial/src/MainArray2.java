public class MainArray2 {
	
	public static void main(String[] args) {
		
		//TODO haced un main, que recibe
		//una serie de argumentos
		//y me imprima el argumento de mayor longitud
		if (args.length == 0) {
            System.out.println("No se han proporcionado argumentos.");
            return;
        }

        String argumentoMasLargo = args[0];

        for (int i = 1; i < args.length; i++) {
            if (args[i].length() > argumentoMasLargo.length()) {
                argumentoMasLargo = args[i];
            }
        }

        System.out.println("El argumento más largo es: " + argumentoMasLargo);
		}	
		
	}
