package code;

public class BTSNode2 {
	public BTSNode2 pai, dir, esq;
	public Integer valor;
	
	public BTSNode2() {
		
	}
	
	public BTSNode2(Integer valor, BTSNode2 pai, BTSNode2 dir, BTSNode2 esq) {
		this.valor = valor;
		this.pai = pai;
		this.dir = dir;
		this.esq = esq;
	}

	public BTSNode2 getPai() {
		return pai;
	}

	public void setPai(BTSNode2 pai) {
		this.pai = pai;
	}

	public BTSNode2 getDir() {
		return dir;
	}

	public void setDir(BTSNode2 dir) {
		this.dir = dir;
	}

	public BTSNode2 getEsq() {
		return esq;
	}

	public void setEsq(BTSNode2 esq) {
		this.esq = esq;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	
	
	
}
