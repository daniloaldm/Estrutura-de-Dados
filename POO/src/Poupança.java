public class Poupança extends Conta {
	public String tipoConta = "Poupança";
	
	public Poupança(String cliente, double saldo,int numConta){
		
		this.setCliente(cliente);
		this.setSaldo(saldo);
		this.setNumConta(numConta);
	}
		
	public String settipoConta() {
		return this.tipoConta;
	}
	
	public void saque(int x){
		setSaldo(getSaldo()-x);
			
	}
	public void deposito(int x){
		setSaldo(getSaldo()+x);
	}
	public String toString() {
		return "Conta Poupança:\n" +super.toString();
	}
	public void nomeCliente(String x) {
		System.out.println("Nome do Cliente: " + this.cliente);
	}

	public int numConta(int x) {
		return this.numConta;
	}

}
