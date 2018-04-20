package Quest02;

public class TreeTest {
    public static void main(String[] args) {
        BinaryTree arv = new BinaryTree<>();
        
        arv.insereRaiz('R');
        arv.insereEsq(arv.raiz, 'F');
        arv.insereDir(arv.raiz, 'E');
        arv.insereEsq(arv.raiz.esq, 'A');
        arv.insereDir(arv.raiz.esq, 'J');
        arv.insereDir(arv.raiz.dir, 'P');
        
        arv.imprimePrefixado();
        System.out.println(arv.profundidade(arv.raiz.dir));
    }
}