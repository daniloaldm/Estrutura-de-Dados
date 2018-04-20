package PacoteArvoreRN;

class No{
    int info;
    No pai;
    No esq, dir;
    boolean cor; //True = vermelho

    public No(int k){
        info = k;
        cor = false;
        esq = dir = pai = null;
    }

    public No(int k, No p){
        this(k);
        pai = p;
        cor = true;
    }


    //Percorre toda árvore procurando se o "k" está nela
    public No busca(int k) {

        if (k > this.info && this.dir != null){
            return this.dir.busca(k);
        }

        else if (k < this.info && this.esq != null){
            return this.esq.busca(k);
        }

        else {
            return this;
        }
    }

    //Imprimir
    public void print() {

        System.out.println(this + ": " + this.esq + " <- (" + this.info + "  +  " + (this.cor ? "V" : "P") + ") -> " + this.dir);
        if (this.esq != null) this.esq.print();
        if (this.dir != null) this.dir.print();
    }

/*
    public No minimo(){

        if(esq != null) {
            return esq.minimo();
        }

        else{
            return this;
        }
    }
*/

    public String toString() {
        return Integer.toString(info);
    }

}