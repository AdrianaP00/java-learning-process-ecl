package appinitial;

import java.util.Scanner;

public class MiPrimeraClase {

	public static void main(String[] args) {

		System.out.println("fin de la primera clase");
//		for (int a = 0; a <= 50; a++) {
//			String b = (a%2 == 0) ? String.valueOf(a) : "marameo";
//			System.out.println(b);
//		}
//		int a = 0;
//		do {
//			String b = (a%2 == 0) ? String.valueOf(a) : "marameo";
//			a++;
//			System.out.println(b);
//		} while (a <= 50);
		
		Scanner scanner = new Scanner (System.in) ;
		
		System.out.println("meteme el numero ");
		int numeroLeido = scanner.nextInt();
		System.out.println(numeroLeido);
		
	}
}
