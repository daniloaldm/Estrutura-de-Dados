package PilhaDinamica;

public class PilhaDinamica {
	public No cabeca;
	public int tam=0;
	
	public void insereInicio(No novoNo) {
		if(tam!=0) {
			No aux = cabeca;
			cabeca = novoNo;
			cabeca.setProximo(aux);						
		}else {
			cabeca = novoNo;
			cabeca.setProximo(null);
		}
		tam++;		
	}
	
	public void removeInicio() {
		if(tam!=0) {
			No noRemovido = cabeca;
			cabeca = noRemovido.getProximo();
			noRemovido.setProximo(null);
			System.out.println("Elemento removido:" + noRemovido.getValor());
			System.out.println();
		}else {
			System.out.println("Pilha Vazia!");
		}
		tam--;
	}
	
	public void imprimiPilha() {
		if(tam==0) {
			System.out.println("Pilha Vazia!");
			System.out.println();
			return;
		}
		
		No aux = cabeca;
		while(aux.getProximo()!=null) {
			System.out.println(aux.getValor());
			aux = aux.getProximo();
		}
		System.out.println(aux.getValor());
		System.out.println();
	}
}
