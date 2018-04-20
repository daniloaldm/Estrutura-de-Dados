package FilaDinamica;

public class TesteFilaDinamica {

	public static void main(String[] args) {
		FilaDinamica fila = new FilaDinamica();

		fila.imprimirFila();
		fila.insereFinal(new No(15, null));
		fila.imprimirFila();
		fila.insereFinal(new No(5, null));
		fila.imprimirFila();
		fila.insereFinal(new No(3, null));
		fila.imprimirFila();
	}

}
