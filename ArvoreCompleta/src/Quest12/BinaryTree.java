package Quest12;

public class BinaryTree<E> {
    public BTSNode<E> raiz;
	
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
}