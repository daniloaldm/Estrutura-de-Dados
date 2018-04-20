package Quest02;

public class BinaryTree<E> {
	public BTSNode<E> raiz;
	
	public int count = 0;
	
	public BinaryTree(){
		raiz = null;
	}
	
	public BTSNode<E> insereRaiz(E valor){
		if(raiz != null)
			throw new IllegalStateException("A árvore já possui raiz!");
		raiz = new BTSNode<>(valor, null, null, null);
		return raiz;
	}
	
	public BTSNode<E> insereEsq(BTSNode<E> pai, E valor){
		if(pai.esq != null)
			throw new IllegalStateException("Já tem filho filho a esquerda!");
		pai.esq = new BTSNode(valor, pai, null, null);
		return pai.esq;
	}
	
	public BTSNode<E> insereDir(BTSNode<E> pai, E valor){
		if(pai.dir != null)
			throw new IllegalStateException("Já tem um filho a direita!");
		pai.dir = new BTSNode(valor, pai, null, null);
		return pai.dir;
	}
	
	public void imprimePrefixado() {
		imprimePrefixado2(raiz);
	}
	
	public void imprimePrefixado2(BTSNode<E> node) {
		if(node != null) {
			System.out.println(node.valor);
			imprimePrefixado2(node.esq);
			imprimePrefixado2(node.dir);
		}			
	}
	
	public int profundidade(BTSNode nodoV) {
		BTSNode paizao = new BTSNode();
		paizao = nodoV.pai;
		
		if(paizao != null) {
			count++;
			profundidade(paizao);
		}
		return count;
	}
}
