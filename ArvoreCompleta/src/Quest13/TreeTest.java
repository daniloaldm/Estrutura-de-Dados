package Quest13;

public class TreeTest {
    public static void main(String[] args) {
        BinaryTree arv = new BinaryTree<>();
        
        arv.inserirRaiz('-');
        arv.inserirEsq(arv.raiz, '/');
        arv.inserirDir(arv.raiz, '+');
        arv.inserirEsq(arv.raiz.esq, '*');
        arv.inserirDir(arv.raiz.esq, '+');
        arv.inserirEsq(arv.raiz.dir, '*');
        arv.inserirDir(arv.raiz.dir, '6');
        arv.inserirEsq(arv.raiz.esq.esq, '+');
        arv.inserirDir(arv.raiz.esq.esq, '3');
        arv.inserirEsq(arv.raiz.esq.dir, '-');
        arv.inserirDir(arv.raiz.esq.dir, '2');
        arv.inserirEsq(arv.raiz.dir.esq, '3');
        arv.inserirDir(arv.raiz.dir.esq, '-');
        arv.inserirEsq(arv.raiz.esq.esq.esq, '3');
        arv.inserirDir(arv.raiz.esq.esq.esq, '1');
        arv.inserirEsq(arv.raiz.esq.dir.esq, '9');
        arv.inserirDir(arv.raiz.esq.dir.esq, '5');
        arv.inserirEsq(arv.raiz.dir.esq.dir, '7');
        arv.inserirDir(arv.raiz.dir.esq.dir, '4');
        
        arv.imprimirPrefixado();
        System.out.println();
        arv.imprimirPosfixado();
        System.out.println();
        arv.imprimirInterfixado();
        System.out.println();
    }
}