package quest01Lista01;

public class PilhaImpl implements Pilha {
		public static final int TAM_PILHA = 5;
		public Integer[] pilha;
		public int pos = -1;

		public PilhaImpl() {
			pilha = new Integer[TAM_PILHA];
		}

		@Override
		public Integer insereTopo(Integer valor) {
			if (pilhaCheia()) {
				return null;
			}

			pilha[++pos] = valor;

			return valor;
		}

		@Override
		public Integer removeTopo() {

			if (pilhaVazia()) {
				return null;
			}

			Integer elementoRemovido = pilha[pos];

			for (int i = TAM_PILHA - 1; i > pos; i--) {
				pilha[i - 1] = pilha[i];
			}
			
			pos--;

			return elementoRemovido;
		}

		@Override
		public boolean pilhaCheia() {
			if (pos == TAM_PILHA - 1) {
				System.out.println("Pilha Cheia");
				return true;
			}
			return false;
		}

		@Override
		public boolean pilhaVazia() {
			if (pos == -1) {
				System.out.println("Pilha Vazia");
				return true;
			}
			return false;
		}

		@Override
		public void imprimePilha() {
			for(int i = 0; i < pos; i++) {
				System.out.print("Elemento ["+i+"]" + ": " + pilha[i] + " " );
			}	
			System.out.println();
		}
}



