package quest06Lista01;

public class Teste {

	public static void main(String[] args) {
		ListaImpl<Integer> lista = new ListaImpl<Integer>();
		
		Integer number = 26;
		
		lista.addPrimeiro(10);
		lista.addPrimeiro(20);
		
		lista.imprimeLista();
		
		lista.addUltimo(30);
		
		lista.imprimeLista();
		
		lista.addUltimo(40);
		
		lista.imprimeLista();
		
		lista.set(1, lista.posterior(3));
		lista.imprimeLista();
		
		lista.set(0, 15);
		lista.imprimeLista();
		
		lista.set(1, 23);
		lista.imprimeLista();
		
		lista.addAntes(2, 26);
		lista.imprimeLista();
		
		lista.addApos(3, 33);
		lista.imprimeLista();
		
		lista.addApos(4, 55);
		lista.imprimeLista();
		
		lista.remove(number);
		lista.imprimeLista();
		
		lista.remove(2);
		lista.imprimeLista();
		
		lista.set(1, lista.posterior(0));


	}

}
