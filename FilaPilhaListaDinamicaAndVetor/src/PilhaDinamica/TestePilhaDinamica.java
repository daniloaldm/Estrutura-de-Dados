package PilhaDinamica;

public class TestePilhaDinamica {

	public static void main(String[] args) {
		PilhaDinamica pilha = new PilhaDinamica();
		
		pilha.imprimiPilha();

		pilha.insereInicio(new No(13,null));
		pilha.insereInicio(new No(14,null));
		pilha.imprimiPilha();

		pilha.insereInicio(new No(15,null));
		pilha.insereInicio(new No(16,null));
		pilha.imprimiPilha();
		
		pilha.removeInicio();
		pilha.imprimiPilha();
		
		pilha.removeInicio();
		pilha.imprimiPilha();
		
		pilha.removeInicio();
		pilha.imprimiPilha();
		
		pilha.removeInicio();
		pilha.imprimiPilha();
	}

}
