package orientacaoaobjetos;

public class Conta {
	
	int numero;
	String titular;
	double saldo;
	double salario;
	double saca;
	
	public static void main(String[] args) {

		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000.0;
		
		System.out.println("Saldo atual: " + minhaConta.saldo);
		
	}

}