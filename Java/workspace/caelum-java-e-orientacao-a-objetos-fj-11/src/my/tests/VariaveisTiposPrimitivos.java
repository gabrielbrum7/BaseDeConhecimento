package my.tests;

public class VariaveisTiposPrimitivos {

		public static void main (String[] args) {
			
			int i = 5; // i recebe a c�pia de um valor 5.
			int j = i; // j recebe a c�pia do valor i.
			i = i + 1; // i vira 6, e j continua 5.
			
			System.out.println("Mostrando valores inteiros: " + i);
			System.out.println("Mostrando valores inteiros: " + j);	
		
			//casting - moldar
			
			double d = 3.2;
			int e = (int) d; // Vai mostrar inteiro, do contr�rio n�o compila.
			
			System.out.println(e);
			
			// No Java, geralmente � usado para n�mero real, fr�cion�rio, ou flutuante; o double.
			
			double x = 3.5;
			
			// Veja como se usa o float:
			
			float y = 5.1f; // � sempre com esse "f" no final do valor. Por isso n�o se usa muito.
		
		}
	
}
