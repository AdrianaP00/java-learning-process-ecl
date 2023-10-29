package appinitial.imc;

import java.util.Scanner;

public class MainIMC {
	public static void main(String[] args) {
		/*
		 * PROGRAMA IMC Índice de Masa Corporal
		 * 
		 * Fórmula IMC = peso kg / altura al cuadrado
		 * 
		 * IMC < 16 DESNUTRIDO IMC >=16 Y < 18 DELGADO IMC >=18 Y < 25 IDEAL IMC >=25 Y
		 * < 31 SOBREPESO IMC >= 31 OBESO
		 * 
		 * TODO: HACED UNA APP QUE PIDA AL USUARIO SU PESO Y SU ESTATURA Y LE INFORME DE
		 * SU IMC NUMÉRICO Y NOMIMAL
		 * 
		 * PEJ: 22.35 IDEAL
		 */
		Scanner scanner = new Scanner (System.in);
		System.out.println("peso kg");
		float peso = scanner.nextFloat();
		System.out.println("altura cm");
		float altura = scanner.nextFloat();
		
		String imcNominal = null;
		double imcNumerico= peso / altura * altura;
		
		if (imcNumerico<16)
		{
			imcNominal ="DESNUTRIDO";
		} else if (imcNumerico>=16 &&  imcNumerico<18){
			imcNominal = "DELGADO";
		} else if (imcNumerico>=18 &&  imcNumerico<25){
			imcNominal = "IDEAL";
		}else if (imcNumerico>=25 &&  imcNumerico<31){
			imcNominal = "SOBREPRESO";
		}else if (imcNumerico>31){
			imcNominal = "OBESO";
		}
		
		
		System.out.println("SU IMC ES "+ imcNumerico + " " + imcNominal);
		
	}
}
