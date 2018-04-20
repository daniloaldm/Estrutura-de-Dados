public class ContaCorrente extends Conta{
	
	public String tipoConta = "Conta Corrente";
	
	public ContaCorrente(String cliente, double saldo, int numConta){
		this.setCliente(cliente);
		this.setSaldo(saldo);
		this.setNumConta(numConta);
	}
		public void saque(int x){
			setSaldo(getSaldo()-x-x*0.1);
			
		}
		public void deposito(int x){
			setSaldo(getSaldo()+x-x*0.1);
		}
		 

		public String toString() {
			return "Conta Corrente:\n" +super.toString();
		}

		public void nomeCliente(String x) {
			System.out.println("Nome do Cliente: " + this.cliente);
		}

		public int numConta(int x) {
			return this.numConta;
		}
		
	}
	


