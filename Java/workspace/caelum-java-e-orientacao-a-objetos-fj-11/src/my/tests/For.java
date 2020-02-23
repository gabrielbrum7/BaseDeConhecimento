package my.tests;

public class For {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("Olá!");
		}
		
		// Poderia ser trocado por um while, veja abaixo:
		
		int a = 0;
		while (a < 10) {
			System.out.println("Olá! (2)");
			a = a + 1;
		}
		
	}

}
