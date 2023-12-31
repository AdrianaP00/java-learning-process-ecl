package juegoNumerosAleatorio;
import java.util.Scanner;

public class JuegoNumerosAleatorio {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int numeroSecreto = (int) (Math.random() * 100) + 1;
			int intentos = 6;
			boolean adivinado = false;
//			boolean o string elec = false o "";			
//			function menu() {
//				  console.log(`start`);
//				  console.log(`exit`);
//				  let menu = prompt(``).toLowerCase();
//				  return int ;
//				}

			System.out.println("¡Bienvenido al juego de adivinar el número entre 1 y 100!");
			System.out.println("Tienes 5 intentos para adivinar el número secreto.");

			// Muestra un mensaje indicando que se busca un número menor.
//		    private static void mensajeNumeroMenor() {
//		        System.out.println("Busco un número menor.");
//		    }
//
//		    // Muestra un mensaje indicando que se busca un número mayor.
//		    private static void mensajeNumeroMayor() {
//		        System.out.println("Busco un número mayor.");
//		    }
//
//		    // Muestra un mensaje de felicitaciones cuando se adivina el número.
//		    private static void mensajeAdivinado() {
//		        System.out.println("¡Enhorabuena! Has adivinado el número secreto.");
//		    }
//
//		    // Muestra un mensaje de Game Over con el número secreto.
//		    private static void mensajeGameOver(int numeroSecreto) {
//		        System.out.println("Game Over. El número secreto era " + numeroSecreto + ".");
//		    }
			do {
				// menu()
//				  switch (menu()) {
//                  case start:
//                      (System.out.print("Ingresa un número: ");
//                      int numeroUsuario = scanner.nextInt();
//
//                      if (numeroUsuario < numeroSecreto) {
//                          mensajeNumeroMenor();
//                      } else if (numeroUsuario > numeroSecreto) {
//                          mensajeNumeroMayor();
//                      } else {
//                          mensajeAdivinado();
//                          adivinado = true;
//                      }
//                      break;)			       
//
//                  case exit:
//                      mensajeSalir();
//                      break;
//
//                  default:
//                      System.out.println("Opción no válida. Por favor, selecciona start o exit.");
//                      break;
//              }
				intentos--;
				System.out.print("Intento " + intentos + ": Ingresa un número: ");
				int numeroUsuario = scanner.nextInt();

				if (numeroUsuario < numeroSecreto) {
					System.out.println("Busco un número mayor.");
					
				} else if (numeroUsuario > numeroSecreto) {
					System.out.println("Busco un número menor.");
					
				} else {
					System.out.println("¡Enhorabuena! Has adivinado el número secreto.");
					adivinado = true;
				}
			} while (intentos > 0 && !adivinado);

			if (!adivinado) {
				System.out.println("Game Over. El número secreto era " + numeroSecreto + ".");
			}
		}
	}

}
