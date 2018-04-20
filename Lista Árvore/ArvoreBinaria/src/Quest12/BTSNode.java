package Quest12;

public class BTSNode<E> {
	public E valor;
	public BTSNode<E> pai, esq, dir;
	
	public BTSNode() {
		
	}
	
	public BTSNode(E valor, BTSNode pai, BTSNode esq, BTSNode dir) {
		this.valor = valor;
		this.pai = pai;
		this.esq = esq;
		this.dir = dir;
	}
}
