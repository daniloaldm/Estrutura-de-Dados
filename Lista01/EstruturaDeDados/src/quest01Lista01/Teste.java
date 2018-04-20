package quest01Lista01;

public class Teste {

	public static void main(String[] args) {
		PilhaImpl pilha = new PilhaImpl();
		
		pilha.removeTopo();
		
		pilha.insereTopo(10);
		pilha.insereTopo(20);
		pilha.insereTopo(30);
		pilha.insereTopo(40);
		pilha.insereTopo(50);
		pilha.insereTopo(60);
			
		pilha.imprimePilha();
			
		pilha.removeTopo();			
		pilha.imprimePilha();

	}

}


