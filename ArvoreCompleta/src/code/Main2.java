package code;

public class Main2 {

	public static void main(String[] args) {
		Arvore2 arv = new Arvore2();
		
		
		
		arv.insereNo(5);
		arv.insereNo(2);
		arv.insereNo(7);
		arv.insereNo(6);
		arv.insereNo(8);
		arv.insereNo(9);
		arv.insereNo(1);
		
		arv.imprimirPosfixado(arv.raiz);
	}

}
