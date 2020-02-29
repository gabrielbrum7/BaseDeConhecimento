package my.tests;

public class Casting {

	public static void main(String[] args) {

		int i = 5;
		double d = (int) 5.5;
		
		/* Não é possível executar isso: int d = (double) 5.5; */
		
		System.out.println(i + " " + d);
		
	}

}
