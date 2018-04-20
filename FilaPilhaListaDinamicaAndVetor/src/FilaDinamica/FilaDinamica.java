package FilaDinamica;

public class FilaDinamica {
	public No cabeca;
	public int tam = 0;
	
	
	public void insereFinal(No novoNo) {

		if(cabeca==null) {
			cabeca = novoNo;
		}else {
			No aux = cabeca;
			while(aux.getProximo()!=null) {
				aux = aux.getProximo();
			}
			
			aux.setProximo(novoNo);
			novoNo.setProximo(null);
			
			tam++;									
		}

	}
	
	public void removeInicio(){
		if(cabeca!=null) {
			No noRemovido = cabeca;
			cabeca = noRemovido.getProximo();
			noRemovido.setProximo(null);
			System.out.println("Elemento removido:" + noRemovido.getValor());	
			tam--;
		}else {
			System.out.println("Fila Vazia!");		
		}

	}
	
	public void imprimirFila() {
		if(cabeca!=null) {
			No aux = cabeca;
			while(aux.getProximo()!=null) {
				System.out.print(aux.getValor() + "|");
				aux = aux.getProximo();	
			}
			System.out.print(aux.getValor());
			System.out.println();
		}else {
			System.out.println("Fila Vazia!");
		}
	}

	
}	
	
	
	
	
