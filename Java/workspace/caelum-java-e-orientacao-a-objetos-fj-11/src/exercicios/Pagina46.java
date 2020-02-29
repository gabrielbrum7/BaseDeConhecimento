package exercicios;

public class Pagina46 {

	public static void main (String[] args) {
		
		// Exercícios da página 46
		
		// 1) Imprima todos os números de 150 a 300.
		
		//for (int i= 150; i >= 150 && i <= 300; i++) {
		//	System.out.println(i);
		//}
		
		// 2) Imprima a soma de 1 até 1000.
		
		int j = 1;
		int y = 0;
		int l = 0;
		
		for (int i = 1; i <= 2; i++) {
			int k = 0;
			k = j + i;
			System.out.println(k);
			j++;	
		}
		for (int x = 8; x >= 8 && x <= 1000; x++) {
			y = x + l;
			System.out.println(y);
			l *= l;
			x *= 2;
			--x;
		}
	}
}
