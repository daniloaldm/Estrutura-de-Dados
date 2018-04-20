package arvore;

import java.util.Arrays;

public class TreeTest<E> {
    public static void main(String[] args) {
        BinaryTree arv = new BinaryTree<>();
        BinaryTree arv2 = new BinaryTree<>();
 
        
        
        arv.inserirRaiz(5);
        arv.inserirEsq(arv.raiz, 2);
        arv.inserirDir(arv.raiz, 7);
        arv.inserirEsq(arv.raiz.esq, 6);
        arv.inserirDir(arv.raiz.esq, 8);
        arv.inserirEsq(arv.raiz.dir, 9);
        arv.inserirDir(arv.raiz.dir, 1);


        arv2.inserirRaiz(5);
        arv2.inserirEsq(arv2.raiz, 2);
        arv2.inserirDir(arv2.raiz, 7);
        arv2.inserirEsq(arv2.raiz.esq, 6);
        arv2.inserirDir(arv2.raiz.esq, 8);
        arv2.inserirEsq(arv2.raiz.dir, 9);
        arv2.inserirDir(arv2.raiz.dir, 1);

        

        
        
    }
		
}
	

