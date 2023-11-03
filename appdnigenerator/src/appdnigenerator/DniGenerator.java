package appdnigenerator;
import java.util.Scanner;

public class DniGenerator {
	
	public static final String LETTERS_SECUENCY ="TRWAGMYFPDXBNJZSQVHLCKE";

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("inserta tu DNI sin letras: ");
        int dni = scanner.nextInt();
        char letra = LETTERS_SECUENCY.charAt(dni%LETTERS_SECUENCY.length());
        System.out.println("tu letra es " + letra);
        
        DNI dni1 = new DNI (9539058, 'S');
        
////        switch(dni) {
////        case 0: 0 = x; break;
////        case 1: 0 = y; break;
////        case 2: 0 = z; break;
//	}
  }
}
