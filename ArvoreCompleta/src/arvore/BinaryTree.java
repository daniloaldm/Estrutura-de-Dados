package arvore;

import java.util.ArrayList;
import java.util.Arrays;


public class BinaryTree<E> {
    public BTSNode<E> raiz;
	public int[] vetor = new int[0];
	
    public BinaryTree() {
	raiz = null;
    }
	
    // insere um no raiz na arvore vazia
    public BTSNode<E> inserirRaiz(E valor) {
        if (raiz != null)
            throw new IllegalStateException("A arvore ja tem raiz");
        raiz = new BTSNode<>(valor, null, null, null);
        return raiz;
    }
	
    // insere um filho a esquerda do dado pai
    public BTSNode<E> inserirEsq(BTSNode<E> pai, E valor) {
        if (pai.esq != null)
            throw new IllegalStateException("Este no ja tem filho a esquerda");
        BTSNode<E> aux = new BTSNode<>(valor, pai, null, null);
        pai.esq = aux;
        return aux;
    }

    // insere um filho a direita do dado pai
    public BTSNode<E> inserirDir(BTSNode<E> pai, E valor) {
        if (pai.dir != null)
            throw new IllegalStateException("Este no ja tem filho a direita");
        BTSNode<E> aux = new BTSNode<>(valor, pai, null, null);
        pai.dir = aux;
        return aux;
    }

    // imprime prefixado
    public void imprimirPrefixado() {
        imprimirPrefixado2(raiz);
    }
	
    private void imprimirPrefixado2(BTSNode<E> v) {
        if (v!=null) {
            System.out.print(v.valor + " ");
            imprimirPrefixado2(v.esq);
            imprimirPrefixado2(v.dir);
        }
    }

    	
    // imprime posfixado
    public void imprimirPosfixado() {
        imprimirPosfixado2(raiz);
    }
	
    private void imprimirPosfixado2(BTSNode<E> v) {
        if (v!=null) {
            imprimirPosfixado2(v.esq);
            imprimirPosfixado2(v.dir);
            System.out.print(v.valor + " ");
        }
    }

    //comentário teste


    //imprime interfixado
    public void imprimirInterfixado() {
        imprimirInterfixado2(raiz);
    }

    private void imprimirInterfixado2(BTSNode<E> v) {
        if (v!=null) {
            imprimirInterfixado2(v.esq);
            System.out.print(v.valor + " ");
            imprimirInterfixado2(v.dir);
        }
    }

}
