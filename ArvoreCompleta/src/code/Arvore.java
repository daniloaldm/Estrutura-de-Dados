package code;
import java.util.ArrayList;
import java.util.Arrays;


public class Arvore {
	
	public BTSNode raiz;
	public int tamanho = 0;
	public int[] vetor = new int[0];
	
	
	public boolean isInternal(BTSNode no) {
		
		if(no != null && (no.getDir() != null || no.getEsq() != null)) {
			return true;
		}
		
		return false;
	}
	
	public boolean isExternal(BTSNode no) {
		
		if(no != null && (no.getDir() == null && no.getEsq() == null)) {
			return true;
		}
		
		return false;
	}
	
	public void insereNo(Integer valor) {
		//Verifica se há algum nó na Árvore
		if(raiz == null) {
			raiz = new BTSNode(valor,null,null,null);
		} else {
			if(valor < raiz.getValor()) {
				if(raiz.getEsq() == null) {
					BTSNode novoNo = new BTSNode(valor,raiz,null,null);
					raiz.setEsq(novoNo);
				} else {
					//Pesquisa onde o nó vai ser inserido
					insereNoRecursivo(raiz.getEsq(),valor);
				}
			} else if (valor > raiz.getValor()) {
				if(raiz.getDir() == null) {
					BTSNode novoNo = new BTSNode(valor,raiz,null,null);
					raiz.setDir(novoNo);
				} else {
					//Pesquisa onde o nó vai ser inserido
					insereNoRecursivo(raiz.getDir(),valor);	
				}
			}
			
		}
		
		vetor=Arrays.copyOf(vetor, tamanho+1);
		vetor[tamanho]=valor;
		tamanho++;
	
	}
	
	

	public Integer insereNoRecursivo(BTSNode noBase, Integer valor) {
		if(valor < noBase.getValor()) {
			//Continua a esquerda
			if(noBase.getEsq() != null) {
				insereNoRecursivo(noBase.getEsq(),valor);
			} else {
				BTSNode novoNo = new BTSNode(valor,noBase,null,null);
				noBase.setEsq(novoNo);
			}
		}
		
		if(valor > noBase.getValor()) {
			//Continua a direita
			if(noBase.getDir() != null) {
				insereNoRecursivo(noBase.getDir(),valor);
			} else {
				BTSNode novoNo = new BTSNode(valor,noBase,null,null);
				noBase.setDir(novoNo);
			}
		}
		
		return valor;
		
	}
	
	public void inserirIterativo(Integer valor) {
		BTSNode novoNo = new BTSNode(valor,null,null,null);
		BTSNode pai = null;
		BTSNode raiz2 = raiz;

		while(raiz2 != null) {
			pai = raiz2;
			if(novoNo.getValor() < raiz2.getValor()) {
				raiz2 = raiz2.getEsq();
			} else {
				raiz2 = raiz2.getDir(); 
			}
		}

		novoNo.setPai(pai); 

		if(pai == null) {
			raiz = novoNo;
		} else if (novoNo.getValor() < pai.getValor()) {
			pai.setEsq(novoNo);
		} else {
			pai.setDir(novoNo);
		}
	}
	
	public BTSNode pesquisarNoRecursivo(Integer valor) {
		return pesquisarNoRecursivo(raiz,valor);
	}
	
	public BTSNode pesquisarNoRecursivo(BTSNode no,Integer valor) {
		if(valor < no.getValor()) {
			if(no.getEsq() != null) {
				pesquisarNoRecursivo(no.getEsq(),valor);
			} else {
				return null;
			}
		}
		
		if(valor > no.getValor()) {
			if(no.getEsq() != null) {
				pesquisarNoRecursivo(no.getDir(),valor);
			} else {
				return null;
			}
		}
		
		return no;
	}
	
	public BTSNode pesquisarNo(Integer valor) {
		BTSNode noBase = new BTSNode();
		noBase = raiz;
		
		while(true) {
			if(valor < noBase.getValor() && noBase.getEsq() != null) {
				noBase = noBase.getEsq();
			} else if (valor < noBase.getValor() && noBase.getEsq() == null) {
				System.out.println("O valor não está na árvore.");
				return null;
			} else if(valor > noBase.getValor() && noBase.getDir() != null) {
				noBase = noBase.getDir();
			} else if (valor > noBase.getValor() && noBase.getDir() == null) {
				System.out.println("O valor não está na árvore.");
				return null;
			} else if (valor == noBase.getValor()) {
				return noBase;
			}	
		}
		
	}
	
	public Integer alturaRecursiva(BTSNode no) {
		if(no != null) {
			return 1 + Math.max(alturaRecursiva(no.getEsq()), alturaRecursiva(no.getDir()));
		}
		return -1;
	}
	
	public Integer alturaRecursiva() {
        return alturaRecursiva(raiz);
    }
	
	public Integer profundidadeRecursiva(BTSNode no) {
		if(no != null) {
			return 1 + profundidadeRecursiva(no.getPai());
		}
		
		return -1;
	}
	
	public Integer profundidadeIterativa(BTSNode no) {
		int profundidade = 0;
		
		while(no.pai != null) {
			profundidade++;
			no = no.pai;
		}
		
		return profundidade;
	}
	
	public boolean arvoreIgual(Arvore a1, Arvore a2) {
		Arrays.sort(a1.vetor);
		Arrays.sort(a2.vetor);
		
		if(a1.alturaRecursiva() != a2.alturaRecursiva()) {
			System.out.println("Árvores diferentes.");
			return false;

		} else if (a1.vetor.length == a2.vetor.length) {
			for(int i = 0; i < a1.vetor.length; i++) {
				if(a1.vetor[i] != a2.vetor[i]) {
					System.out.println("Árvores diferentes.");
					return false;
				}
			}
			System.out.println("Árvores iguais.");
			return true;
		}
		System.out.println("Árvores diferentes.");
		return false;
	}
	
	public int alturaIterativa(BTSNode no) {
		int altura = 0;
		ArrayList<BTSNode> lista = new ArrayList<BTSNode>();
		
		if(no != null) lista.add(no);
	
		while(lista.size() > 0) { //nó não é nulo
			int atual = lista.size();
			altura++;
			
			while(atual > 0) {
				BTSNode temp = lista.remove(0);
				if(temp.getDir() != null) {
					lista.add(temp.getDir());
				}
				if(temp.getEsq() != null) {
					lista.add(temp.getEsq());
				}
				
				atual--;
			}
		}
		
		return altura - 1;
	}
	
	public int alturaIterativa() {
		return alturaIterativa(raiz);
	}
	
	public void imprimirPrefixado() {
		imprimirPrefixado2(raiz);
		System.out.println();
	}
	
	public void imprimirPrefixado2(BTSNode v) {
		if (v!=null) {
			System.out.print(v.getValor() + " ");
			imprimirPrefixado2(v.getEsq());
			imprimirPrefixado2(v.getDir());
		}
	}
	
	public void imprimirPosfixado() {
		imprimirPosfixado2(raiz);
		System.out.println();
	}
	
	public void imprimirPosfixado2(BTSNode v) {
		if (v!=null) {
			imprimirPosfixado2(v.getEsq());
			imprimirPosfixado2(v.getDir());
			System.out.print(v.getValor() + " ");
		}
	}
	
	public void imprimirInterfixado() {
		imprimirInterfixado2(raiz);
		System.out.println();
	}
	
	public void imprimirInterfixado2(BTSNode v) {
		if (v!=null) {
			imprimirInterfixado2(v.getEsq());
			System.out.print(v.getValor() + " ");
			imprimirInterfixado2(v.getDir());
		}
	}
	
	public void imprimirDecrescente(Arvore a1) {
		Arrays.sort(a1.vetor);
		for(int i = a1.vetor.length - 1; i >= 0; i--) {
			System.out.print(a1.vetor[i] + " ");
			
		}
	}
	
	public void imprimirFolha(BTSNode v) {
		if (v!=null) {
			imprimirFolha(v.getEsq());
			if(isExternal(v)) System.out.print(v.getValor() + " ");
			imprimirFolha(v.getDir());
		}
	}
	
	public void imprimirFolha() {
		imprimirFolha(raiz);
		System.out.println();
	}

	public BTSNode getRaiz() {
		return raiz;
	}

	public void setRaiz(BTSNode raiz) {
		this.raiz = raiz;
	}
	
}
