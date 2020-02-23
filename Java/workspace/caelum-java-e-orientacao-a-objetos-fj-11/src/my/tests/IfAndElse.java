package my.tests;

public class IfAndElse {
			
	public static void main(String[] args) {
	
		// if e else com operadores lógicos, && para "e", || para "ou".
		
		int idade = 15;
		boolean amigoDoDono = true;
		//if (idade < 18 && amigoDoDono == false) {
		if (idade < 18 && !amigoDoDono) { //"!", torna ao contrário a expressão booleana, é a mesma coisa que "== false", se era true.
			System.out.println("Não pode entrar.");
		} else {
			System.out.println("Pode entrar.");
		}
	}

}