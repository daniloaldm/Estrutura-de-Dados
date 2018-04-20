package PilhaVetor;

public class TestePilhaVetor {

	public static void main(String[] args) {
		Pilha pilhaImpl = new Pilha();
		
		pilhaImpl.imprimePilha();
		pilhaImpl.insereFinal(5);

		pilhaImpl.imprimePilha();
		
		pilhaImpl.insereFinal(15);
		pilhaImpl.imprimePilha();
		
		pilhaImpl.removeFinal();
		pilhaImpl.imprimePilha();
		
		pilhaImpl.removeFinal();
		pilhaImpl.removeFinal();
		pilhaImpl.removeFinal();
		
		pilhaImpl.imprimePilha();

		pilhaImpl.insereFinal(5);
		pilhaImpl.imprimePilha();
		pilhaImpl.insereFinal(3);
		pilhaImpl.imprimePilha();
		pilhaImpl.insereFinal(7);
		pilhaImpl.imprimePilha();
		pilhaImpl.insereFinal(14);
		pilhaImpl.imprimePilha();
		pilhaImpl.insereFinal(21);
		pilhaImpl.imprimePilha();
		pilhaImpl.insereFinal(22);
		pilhaImpl.imprimePilha();
		
		pilhaImpl.removeFinal();
		pilhaImpl.imprimePilha();
		
		
	}

}
