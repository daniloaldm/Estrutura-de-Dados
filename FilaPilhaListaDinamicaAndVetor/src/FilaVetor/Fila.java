package FilaVetor;

public class Fila implements FilaVetorInterface {
	public static final int TAM = 5;
	public Integer []fila = new Integer[TAM];
	public Integer pos = -1;

	@Override
	public Integer insereFinal(Integer valor) {
		if(filaCheia() == true) {
			return null;
		}
		
		fila[++pos] = valor;
		return valor;

	}

	@Override
	public void removeInicio() {
		if(filaVazia()) {
			return;
		}
		
		System.out.print("Elemento removido:");
		System.out.println(fila[0]);
		
		for(int i = 0 ; i <= (pos) ; i++) {
			fila[i] = fila[i+1];			
		}

		pos--;
		

	}

	@Override
	public boolean filaVazia() {
		if(pos == -1) {
			System.out.println("Fila Vazia!");
			return true;

		}
		return false;
	}

	@Override
	public boolean filaCheia() {
		if(pos == TAM-1) {
			System.out.println("Fila Cheia!");
			return true;
		}
		return false;
	}

	@Override
	public void imprimeFila() {
		if(pos != -1) {
			for(int i = 0 ; i <= pos ; i++) {
				System.out.print("\t");
				System.out.print(fila[i]);
			}
			System.out.println();
		}
		
		if(pos == -1) {
			System.out.println("Impossível imprimir Fila, a mesma se encontra vazia!");
		}

	}

}
