package my.tests;

public class Break {

	public static void main(String[] args) {
		
		/*int x = 0;
		int y = 30;
		for (int i = x; i < y; i++) {
			if (i % 19 == 0) {
				System.out.println("Achei um n�mero divis�vel por 19 entre x e y.");
				break;
			}*/
			
		// O continue, j� obriga o loop a continuar, veja:
		
		for (int a = 0; a < 100; a++) {
			if (a > 50 && a < 60) {
				continue;
			}
			System.out.println(a); // O c�digo acima n�o vai imprimir de 51 a 59.
		}
			
	}

}

