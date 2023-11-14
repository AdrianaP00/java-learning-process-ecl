
public class Ejercicio {
	static int a = 0;
	int b = 0;

	public void foo() {
		while (b > 0) {
			b--;
			a++;

		}
	}

	public static void main(String[] args) {
		var p1 = new Ejercicio();
		p1.foo();
		var p2 = new Ejercicio();
		p2.foo();
		
		System.out.println(p1.a + "" + p2.a);
	}
}
