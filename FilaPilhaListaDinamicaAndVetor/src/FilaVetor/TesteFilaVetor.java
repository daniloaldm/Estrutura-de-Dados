package FilaVetor;

public class TesteFilaVetor {

	public static void main(String[] args) {
		Fila filaImpl = new Fila();
		
		filaImpl.imprimeFila();
		filaImpl.insereFinal(5);

		filaImpl.imprimeFila();
		
		filaImpl.insereFinal(15);
		filaImpl.imprimeFila();
		
		filaImpl.removeInicio();
		filaImpl.imprimeFila();
		
		filaImpl.removeInicio();
		filaImpl.removeInicio();
		filaImpl.removeInicio();
		
		filaImpl.imprimeFila();

		filaImpl.insereFinal(5);
		filaImpl.imprimeFila();
		filaImpl.insereFinal(3);
		filaImpl.imprimeFila();
		filaImpl.insereFinal(7);
		filaImpl.imprimeFila();
		filaImpl.insereFinal(14);
		filaImpl.imprimeFila();
		filaImpl.insereFinal(21);
		filaImpl.imprimeFila();
		filaImpl.insereFinal(22);
		filaImpl.imprimeFila();
	}

}
