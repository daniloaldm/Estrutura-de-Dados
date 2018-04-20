package Quest01;

public class TreeTest {
    public static void main(String[] args) {
        BinaryTree arv = new BinaryTree<>();
        
        arv.inserirRaiz('R');
        arv.inserirEsq(arv.raiz, 'F');
        arv.inserirDir(arv.raiz, 'E');
        arv.inserirEsq(arv.raiz.esq, 'A');
        arv.inserirDir(arv.raiz.esq, 'J');
        arv.inserirDir(arv.raiz.dir, 'P');
        
        arv.imprimirPrefixado();
    }
}