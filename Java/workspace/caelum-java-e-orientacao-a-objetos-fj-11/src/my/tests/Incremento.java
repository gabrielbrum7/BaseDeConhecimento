package my.tests;

public class Incremento {
	
	public static void main (String[] args) {
		
		// Pós incremento (i++)
		
		int i = 5;
		int x = i++;
		
		System.out.println("Imprima i: " + i);
		System.out.println("Imprima x: " + x);
		
		//--
		
		// Pré incremento (++a)
		
		int a = 5;
		int y = ++a; /* A diferença é que os valores das variáveis se
						tornam iguais */
		
		System.out.println("imprima a: " + a);
		System.out.println("Imprima y: " + y);
		
		//--
		
	}
	
}
