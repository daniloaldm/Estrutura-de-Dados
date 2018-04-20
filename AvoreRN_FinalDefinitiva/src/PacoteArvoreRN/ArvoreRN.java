package PacoteArvoreRN;

public class ArvoreRN{
    No raiz;

    public ArvoreRN(int k){
        raiz = new No(k);
    }

    //==================================================================================================================
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //================================================= Rotações =======================================================

    public void rotacaoEsquerda(No x){

        No y = x.dir;
        x.dir = y.esq;

        if(y.esq != null){
            y.esq.pai = x;
        }

        y.pai = x.pai;

        if(x.pai == null){
            raiz = y;
        }

        else if(x == x.pai.esq){
            x.pai.esq = y;
        }

        else{
            x.pai.dir = y;
        }

        y.esq = x;
        x.pai = y;
    }

    public void rotacaoDireita(No x){ //Igual rotacaoEsquerda, só mudei direito por esquerdo

        No y = x.esq;
        x.esq = y.dir;

        if(y.dir != null){
            y.dir.pai = x;
        }

        y.pai = x.pai;

        if(x.pai == null){
            raiz = y;
        }

        else if(x == x.pai.dir){
            x.pai.dir = y;
        }

        else{
            x.pai.esq = y;
        }

        y.dir = x;
        x.pai = y;
    }

    //==================================================================================================================
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //================================================= Insere No ======================================================

    public void insere(int k){

        No aux = raiz.busca(k); //aux recebe a busca do nó que vai ser pai do k

        if(k > aux.info){
            this.insereFix(aux.dir = new No(k, aux)); //método No(k, No p)
        }

        else if(k < aux.info){
            this.insereFix(aux.esq = new No(k, aux)); //método No(k, No p)
        }
    }

    //Usado no insere

    public void insereFix(No z){
        No y;
        while(z.pai != null && z.pai.cor){ //Enquanto a cor for do nodo for vermelha
            if(z.pai == z.pai.pai.esq){ //se true == true
                y = z.pai.pai.dir;
                if(y.cor){ //Se cor de y é vermelha
                    z.pai.cor = false;
                    y.cor = false;
                    z.pai.pai.cor = true;
                    z = z.pai.pai;
                }else{
                    if(z == z.pai.dir){
                        z = z.pai;
                        rotacaoEsquerda(z);
                    }
                    z.pai.cor = false;
                    z.pai.pai.cor = true;
                    rotacaoDireita(z.pai.pai);
                }
            }else{ //Mesma coisa, só onde inverte direito e esquerdo
                y = z.pai.pai.esq;
                if(y.cor){ //Se cor de y é vermelha
                    z.pai.cor = false;
                    y.cor = false;
                    z.pai.pai.cor = true;
                    z = z.pai.pai;
                }else{
                    if(z == z.pai.esq){
                        z = z.pai;
                        rotacaoDireita(z);
                    }
                    z.pai.cor = false;
                    z.pai.pai.cor = true;
                    rotacaoEsquerda(z.pai.pai);
                }
            }
        }

        raiz.cor = false;
    }

    //==================================================================================================================
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //================================================== Buscar ========================================================

    public void encontra(int k){
        No aux = raiz.busca(k);

        if(aux.info != k) {
            System.out.println("O elemento " + k + " não está presente na árvore!");
        }

        else{
            System.out.println("O elemento " + aux.info + " está presente na árvore!");
        }
    }

    //==================================================================================================================
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //================================================== Deletar =======================================================
/*
    //Deletar

    public void delete(No z){
        No y = z, x;
        boolean yCorOriginal = y.cor;
        if(z.esq == null){
            x = z.dir;
            transplant(z, z.dir);
        }else if(z.dir == null){
            x = z.esq;
            transplant(z, z.esq);
        }else{
            y = z.dir.minimo();
            yCorOriginal = y.cor;
            x = y.dir;
            if(y.pai == z) x.pai = y;
            else{
                transplant(y, y.dir);
                y.dir = z.dir;
                y.dir.pai = y;
            }
            transplant(z, y);
            y.esq = z.esq;
            y.esq.pai = y;
            y.cor = z.cor;
        }
        if(yCorOriginal == false){
            delFix(x);
        }
    }

    //Usado pra deletar

    public void transplant(No u, No v){
        if(u.pai == null) raiz = v;
        else if(u == u.pai.esq) u.pai.esq = v;
        else u.pai.dir = v;
        if(v != null) v.pai = u.pai;
    }

    //Usado pra deletar

    public void delFix(No x){
        No w;
        while(x != null && x != raiz && x.cor == false){
            if(x == x.pai.esq){
                w = x.pai.dir;
                if(w.cor){ //W é vermelho ?
                    w.cor = false;
                    x.pai.cor = true;
                    rotacaoEsquerda(x.pai);
                    w = x.pai.dir;
                }
                if(w.esq.cor == false && w.dir.cor == false){
                    w.cor = true;
                    x = x.pai;
                }else{
                    if(w.dir.cor == false){
                        w.esq.cor = false;
                        w.cor = true;
                        rotacaoDireita(w);
                        w = x.pai.dir;
                    }
                    w.cor = x.pai.cor;
                    x.pai.cor = false;
                    w.dir.cor = false;
                    rotacaoEsquerda(x.pai);
                    x = raiz;
                }
            }else{
                w = x.pai.esq;
                if(w.cor){ //W é vermelho ?
                    w.cor = false;
                    x.pai.cor = true;
                    rotacaoDireita(x.pai);
                    w = x.pai.esq;
                }
                if(w.dir.cor == false && w.esq.cor == false){
                    w.cor = true;
                    x = x.pai;
                }else{
                    if(w.esq.cor == false){
                        w.dir.cor = false;
                        w.cor = true;
                        rotacaoEsquerda(w);
                        w = x.pai.esq;
                    }
                    w.cor = x.pai.cor;
                    x.pai.cor = false;
                    w.esq.cor = false;
                    rotacaoDireita(x.pai);
                    x = raiz;
                }
            }
        }
        if(x != null) x.cor = false;
    }
*/

}