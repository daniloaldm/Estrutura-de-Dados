package code;

import java.util.ArrayList;
import java.util.Arrays;

public class Arvore2 {
	public BTSNode2 raiz;

	
	//Verifica se o nodo é interno
	public boolean isInternal(BTSNode2 no) {
		if(no != null && no.getDir() != null || no.getEsq() != null) {
			return true;
		}
		return false;
	}
	
	//Verifica se o nodo é externo
	public boolean isExternal(BTSNode2 no) {
		if(no != null && no.getDir() == null && no.getEsq() == null) {
			return true;
		}
		return false;
	}
	
	//Insere nodo

	public Integer insereNo(Integer valor) {
		if(raiz == null) {
			raiz = new BTSNode2(valor, null, null ,null);
		}else {
			insereNoRecursivo(raiz, valor);
		}
		
		return valor;
	}
	
	public void insereNoRecursivo(BTSNode2 noBase, Integer valor) {
		if(valor < noBase.getValor()) {
			if(noBase.getEsq() != null) {
				insereNoRecursivo(noBase.getEsq(), valor);
			}else {
				BTSNode2 novoNo = new BTSNode2(valor, noBase, null , null);
				noBase.setEsq(novoNo);
			}
		}
		
		if(valor > noBase.getValor()) {
			if(noBase.getDir() != null) {
				insereNoRecursivo(noBase.getDir(), valor);
			}else {
				BTSNode2 novoNo = new BTSNode2(valor, noBase, null, null);
			}			
		}
	}
	
	//Imprime Posfixado
	
	public void imprimirPosfixado(BTSNode2 noBase) {
		if(noBase != null) {
			imprimirPosfixado(noBase.getEsq());
			imprimirPosfixado(noBase.getDir());
			System.out.print(noBase.getValor() + " ");
		}
	}

	//Imprime Prefixado
	public void imprimirPrefixado(BTSNode2 noBase) {
		if(noBase != null) {
			System.out.print(noBase.getValor() + " ");
			imprimirPrefixado(noBase.getEsq());
			imprimirPrefixado(noBase.getDir());
		}
	}

	
	//Imprime Interfixado
	
	public void imprimirInterfixado(BTSNode2 noBase) {
		if(noBase != null) {
			imprimirInterfixado(noBase.getEsq());
			System.out.print(noBase.getValor());
			imprimirInterfixado(noBase.getDir());
		}
	}
	
	//Árvores Iguais q01
	
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
	
	/*
	 * 02-   Dada uma árvore binária completa, qual a
      relação entre o número de nós externos e 
      internos?
      
      Se for uma árvore binária completa, o número de nodos
      externos é o número de nodos internos+1.
   	
	 */
	
	//Altura iterativa q03
	
	public Integer alturaIterativa(BTSNode2 no) {
		if(no == null) {
			return -1;
		} else {
			ArrayList<BTSNode2> nos = new ArrayList<BTSNode2>();
			ArrayList<Integer> alturas = new ArrayList<Integer>();
			
			nos.add(no);
			alturas.add(0);
			Integer maxAltura = -1;
			
			while(nos.size() > 0) {
				Integer alturaAtual = alturas.remove(0);
				BTSNode2 temp = nos.remove(0);
				
				if(temp.getDir() != null) {
					nos.add(temp.getDir());
					alturas.add(alturaAtual+1);
				}
				
				if(temp.getEsq() != null) {
					nos.add(temp.getEsq());
					alturas.add(alturaAtual+1);
				}
				
				if(alturaAtual > maxAltura) maxAltura = alturaAtual;
			}
			
			return maxAltura;
		}
		
	}
	
	public int alturaIterativa() {
		return alturaIterativa(raiz);
	}
	
	//Altura Recursiva

	public Integer alturaRecursiva(BTSNode2 no) {
		if(no != null) {
			return 1 + Math.max(alturaRecursiva(no.getEsq()), alturaRecursiva(no.getDir()));
		}
		return -1;
	}
	
	public Integer alturaRecursiva() {
        return alturaRecursiva(raiz);
    }
	
	//Profundidade Iterativa q04
	
	public Integer profundidadeIterativa(BTSNode2 no) {
		int profundidade = 0;
		
		while(no.pai != null) {
			profundidade++;
			no = no.pai;
		}
		
		return profundidade;
	}

	//Profundidade Recursiva
	
	public Integer profundidadeRecursiva(BTSNode no) {
		if(no != null) {
			return 1 + profundidadeRecursiva(no.getPai());
		}
		
		return -1;
	}
	
	//Pesquisar se tem determinado valor na arvore
	
	public BTSNode2 pesquisarNoRecursivo(Integer valor) {
		return pesquisarNoRecursivo(raiz,valor);
	}
	
	public BTSNode2 pesquisarNoRecursivo(BTSNode2 no,Integer valor) {
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
	
	//Imprimir decrescente
	
	public void imprimirDecrescente(Arvore a1) {
		Arrays.sort(a1.vetor);
		for(int i = a1.vetor.length - 1; i >= 0; i--) {
			System.out.print(a1.vetor[i] + " ");
			
		}
	}
	
	
}

