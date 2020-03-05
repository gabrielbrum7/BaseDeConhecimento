package orientacaoaobjetos;

public class TestaAlgunsMetodos {
	
	public static void main(String[] args) {

		class Conta {
			int numero;
			String titular;
			double saldo;
			
			void saca(double quantidade) {
				double novoSaldo = this.saldo - quantidade;
				this.saldo = novoSaldo;
			}
			
			void deposita(double quantidade) {
			this.saldo += quantidade;
			}
			
		}
		
		// Criando conta
		Conta minhaConta;
		minhaConta = new Conta();
		
		// Alterando os valores de minha conta
		minhaConta.titular = "Duke";
		minhaConta.saldo = 1000.0;
		
		// Saca 200 reais
		minhaConta.saca (200);
		
		// Deposita 500 reais
		minhaConta.deposita(500);
		System.out.println(minhaConta.saldo);
		
	}

}
