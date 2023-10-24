package appinitial.basico;

public class MainPersona {
 public static void main(String[] args) {
	System.out.println("main persona");
	Persona persona = new Persona();
	persona.edad = 23;
	persona.nombre = "Adriana";
	
	Persona prof = new Persona();
	prof.edad = 39;
	prof.nombre = "Valeriano";
	}
}
