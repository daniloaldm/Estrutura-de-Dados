package PacoteArvoreAVL;

public class No {

    private No esquerda, direita, pai;
    private int valor, balanceamento;

    public No(int k) {
        setEsquerda(setDireita(setPai(null)));
        setBalanceamento(0);
        setValor(k);
    }

    public String toString() {
        return Integer.toString(getValor());
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getBalanceamento() {
        return balanceamento;
    }

    public void setBalanceamento(int balanceamento) {
        this.balanceamento = balanceamento;
    }

    public No getPai() {
        return pai;
    }

    public No setPai(No pai) {
        this.pai = pai;
        return pai;
    }

    public No getDireita() {
        return direita;
    }

    public No setDireita(No direita) {
        this.direita = direita;
        return direita;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
}
