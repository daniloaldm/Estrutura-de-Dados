package PilhaVetor;

public class Pilha implements PilhaVetorInterface {
	public static final int TAM = 5;
	public Integer []pilha = new Integer[TAM];
	public Integer pos = -1;

	@Override
	public Integer insereFinal(Integer valor) {
		if(pilhaCheia() == true) {
			return null;
		}
		
		pilha[++pos] = valor;
		return valor;

	}

	@Override
	public void removeFinal() {
		if(pilhaVazia()) {
			return;
		}
		
		System.out.print("Elemento removido:");
		System.out.println(pilha[pos]);
		pilha[pos]=null;

		pos--;
		

	}

	@Override
	public boolean pilhaVazia() {
		if(pos == -1) {
			System.out.println("pilha Vazia!");
			return true;

		}
		return false;
	}

	@Override
	public boolean pilhaCheia() {
		if(pos == TAM-1) {
			System.out.println("pilha Cheia!");
			return true;
		}
		return false;
	}

	@Override
	public void imprimePilha() {
		if(pos != -1) {
			for(int i = 0 ; i <= pos ; i++) {
				System.out.print("\t");
				System.out.print(pilha[i]);
			}
			System.out.println();
		}
		
		if(pos == -1) {
			System.out.println("Impossível imprimir pilha, a mesma se encontra vazia!");
		}

	}

}
