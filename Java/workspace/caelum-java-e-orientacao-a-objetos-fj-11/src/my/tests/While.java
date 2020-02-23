package my.tests;

public class While {

	public static void main(String[] args) {
		
		// Primeiro Exemplo:
		
		int idade = 15;
		while (idade < 18) {
			System.out.println(idade);
			idade = idade + 1;
		}
		// O texto será executado até que a condição passe a ser falsa.
		//--
		
		// Segundo exemplo:
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i = i + 1;
		}

	}

}
