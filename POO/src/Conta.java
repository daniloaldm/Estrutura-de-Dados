public abstract class Conta {
	String cliente;
	double saldo;
	int numConta;
	String tipoConta;
	
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public abstract void saque(int x);
	public abstract void deposito(int x);
	public abstract void nomeCliente(String x);
	public abstract int numConta(int x);



	public String toStrig() {
		return "Conta [cliente=" + cliente + ", saldo=" + saldo + ", numConta="
				+ numConta + "]";
	}

	



}
