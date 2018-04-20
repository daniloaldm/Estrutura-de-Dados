import java.util.ArrayList;
import java.util.List;

public class Banco {
	List<Conta> contas = new ArrayList<Conta>();
	
	public void cadastrarContas(Conta x){
		contas.add(x);
	}
	public void deposito(int numConta,int valorDeposito){
		for(Conta c:contas){
			if(c.getNumConta()==numConta){
				c.deposito(valorDeposito);
			}
			
		}	
	}
	public void saque(int numConta,int valorSaque){
		for(Conta c:contas){
			if(c.getNumConta()==numConta){
				c.saque(valorSaque);	
			}
		}
	}
	public void transferencia(int numConta1,int numConta2,double valorDeposito){
		Conta conta1=null;
		Conta conta2=null;		
		for(Conta c:contas){
			if(c.getNumConta()==numConta1){
				conta1 = c;
			}
			if(c.getNumConta()==numConta2){
				conta2 = c;
			}
		}
		if(conta1.getSaldo()<valorDeposito){
			System.out.println("Valor insuficiente");
		}
		else{
			conta1.setSaldo(conta1.getSaldo()-valorDeposito);
			conta2.setSaldo(conta2.getSaldo()+valorDeposito);
		}
	}
	public void listarContas(){
		for(Conta c: contas){
			System.out.println(c.toString());
		}
	}
	public void listarContaPoupanca() {
		for(Conta c: contas){
		if(c.) {
			System.out.println(c.toString());
		}
		}
	}
}