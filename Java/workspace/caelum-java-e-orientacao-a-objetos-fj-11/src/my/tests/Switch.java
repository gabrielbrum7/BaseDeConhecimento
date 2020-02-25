package my.tests;

public class Switch {

	public static void main(String[] args) {

		int dia = 1;
		switch (dia) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terça");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sábado");
				break;
		}
		
		/* Segundo exemplo: usando um default. É uma mensagem padrão se não
		   caiu em nenhum dos casos. */
		
		int dia2 = 4;
		switch (dia2) {
			case 1:
				System.out.println("Hoje é sábado.");
				break;
			case 2:
				System.out.println("Hoje é domingo");
				break;
			default:
			System.out.println("Ansioso para o fim de semana.");

		}
	}

}
