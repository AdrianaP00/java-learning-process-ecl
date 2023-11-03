package appdnigenerator;

public class DNI {
	private int number;
	private char letters;

	// num y lett
	public DNI(int number, char letters) {
		super();
		this.number = number;
		this.letters = letters;
	}
	
    // def
	public DNI() {
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public char getLetters() {
		return letters;
	}

	public void setLetters(char letters) {
		this.letters = letters;
	}

	
}
