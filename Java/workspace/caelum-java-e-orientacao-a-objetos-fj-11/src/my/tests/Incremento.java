package my.tests;

public class Incremento {
	
	public static void main (String[] args) {
		
		// P�s incremento (i++)
		
		int i = 5;
		int x = i++;
		
		System.out.println("Imprima i: " + i);
		System.out.println("Imprima x: " + x);
		
		//--
		
		// Pr� incremento (++a)
		
		int a = 5;
		int y = ++a; /* A diferen�a � que os valores das vari�veis se
						tornam iguais */
		
		System.out.println("imprima a: " + a);
		System.out.println("Imprima y: " + y);
		
		//--
		
		// P�s incremento (i--)
		
		int d = 5;
		int z = d--;
				
		System.out.println("Imprima d: " + d);
		System.out.println("Imprima z: " + z);
				
		//--
				
		// Pr� incremento (--a)
				
		int t = 5;
		int j = --t; /* A diferen�a � que os valores das vari�veis se
						tornam iguais */
				
		System.out.println("imprima t: " + t);
		System.out.println("Imprima j: " + j);
				
		//--
		
		// Testando +=, soma, veja:
		
		int m = 5;
		int n = 2;
		
		m += n;
		
		// m recebe (m + n) e n continua sendo n, veja:
		
		System.out.println("Exemplo de Soma: " + m + " " + n);
		
		// Testando -=, subtra��o, veja:
		
		int k = 5;
		int l = 2;
		
		k -= l;
		
		// k recebe (k - l) e l continua sendo l, veja:
		
		System.out.println("Exemplo de Subtra��o: " + k + " " + l);
		
		//--
		
	}
	
}
