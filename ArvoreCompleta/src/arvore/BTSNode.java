package arvore;

public class BTSNode<E> {
    public E valor;
    public BTSNode<E> pai, esq, dir;

    public BTSNode() {};
    
    public BTSNode(E valor, BTSNode<E> pai, BTSNode<E> esq, BTSNode<E> dir) {
	this.valor = valor;
	this.pai = pai;
	this.esq = esq;
	this.dir = dir;
    }
}
