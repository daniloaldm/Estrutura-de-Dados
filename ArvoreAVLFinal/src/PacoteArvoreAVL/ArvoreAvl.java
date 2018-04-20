package PacoteArvoreAVL;


public class ArvoreAvl {

    public No raiz;

    //================================================= Insere No ======================================================

    public void insere(int k) {
        No novoNo = new No(k);
        inserirAVL(this.raiz, novoNo);
    }

    public void inserirAVL(No aComparar, No aInserir) {

        if (aComparar == null) {
            this.raiz = aInserir;

        } else {

            if (aInserir.getValor() < aComparar.getValor()) {

                if (aComparar.getEsquerda() == null) {
                    aComparar.setEsquerda(aInserir);
                    aInserir.setPai(aComparar);
                    verificarBalanceamento(aComparar);

                } else {
                    inserirAVL(aComparar.getEsquerda(), aInserir);
                }

            } else if (aInserir.getValor() > aComparar.getValor()) {

                if (aComparar.getDireita() == null) {
                    aComparar.setDireita(aInserir);
                    aInserir.setPai(aComparar);
                    verificarBalanceamento(aComparar);

                } else {
                    inserirAVL(aComparar.getDireita(), aInserir);
                }

            } else {
                System.out.println("O nó já existe!");
            }
        }
    }

    //==================================================================================================================

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //=============================================Verificar Balanceamento==============================================

    /*
     * Para verificar se a sub-árvore está desequlibrada, basta verificar se o número
     *do fator de balanceamento for maior do que 1 ou menor do que -1, se for um dos
     *casos essa sub-árvore está desbalanceada.
     *
     */

    public void verificarBalanceamento(No NoAtual) {
        setBalanceamento(NoAtual);
        int balanceamento = NoAtual.getBalanceamento();
                            //<-1
        if (balanceamento == -2) {

            if (altura(NoAtual.getEsquerda().getEsquerda()) >= altura(NoAtual.getEsquerda().getDireita())) {
                //LL → caso Left-Left (rotação a direita)
                System.out.println("Fez uma rotaçao a direita no No:" + NoAtual);
                NoAtual = rotacaoDireita(NoAtual);

            } else {
                //LR → caso Left-Right (rotação esquerda-direita)
                System.out.println("Fez uma rotacao dupla a direita no No:" + NoAtual);
                NoAtual = duplaRotacaoEsquerdaDireita(NoAtual);
            }
                                //>1
        } else if (balanceamento == 2) {

            if (altura(NoAtual.getDireita().getDireita()) >= altura(NoAtual.getDireita().getEsquerda())) {
                //RR → caso Right-Right (rotação a esquerda)
                System.out.println("Fez uma rotacao a esquerda no No:" + NoAtual);
                NoAtual = rotacaoEsquerda(NoAtual);

            } else {
                //RL → caso Right-Left (rotação direita-esquerda)
                System.out.println("Fez uma rotacao dupla a esquerda no No:" + NoAtual);
                NoAtual = duplaRotacaoDireitaEsquerda(NoAtual);
            }
        }

        if (NoAtual.getPai() != null) {
            verificarBalanceamento(NoAtual.getPai());
        } else {
            this.raiz = NoAtual;
        }
    }

    //==================================================================================================================

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //==================================================Rotacoes========================================================

    //RR → caso Right-Right (rotação a esquerda)
    public No rotacaoEsquerda(No inicial) {

        No direita = inicial.getDireita();
        direita.setPai(inicial.getPai());

        inicial.setDireita(direita.getEsquerda());

        if (inicial.getDireita() != null) {
            inicial.getDireita().setPai(inicial);
        }

        direita.setEsquerda(inicial);
        inicial.setPai(direita);

        if (direita.getPai() != null) {

            if (direita.getPai().getDireita() == inicial) {
                direita.getPai().setDireita(direita);

            } else if (direita.getPai().getEsquerda() == inicial) {
                direita.getPai().setEsquerda(direita);
            }
        }

        setBalanceamento(inicial);
        setBalanceamento(direita);

        return direita;
    }

    //LL → caso Left-Left (rotação a direita)
    public No rotacaoDireita(No inicial) {

        No esquerda = inicial.getEsquerda();
        esquerda.setPai(inicial.getPai());

        inicial.setEsquerda(esquerda.getDireita());

        if (inicial.getEsquerda() != null) {
            inicial.getEsquerda().setPai(inicial);
        }

        esquerda.setDireita(inicial);
        inicial.setPai(esquerda);

        if (esquerda.getPai() != null) {

            if (esquerda.getPai().getDireita() == inicial) {
                esquerda.getPai().setDireita(esquerda);

            } else if (esquerda.getPai().getEsquerda() == inicial) {
                esquerda.getPai().setEsquerda(esquerda);
            }
        }

        setBalanceamento(inicial);
        setBalanceamento(esquerda);

        return esquerda;
    }

    //LR → caso Left-Right (rotação esquerda-direita)
    public No duplaRotacaoEsquerdaDireita(No inicial) {
        inicial.setEsquerda(rotacaoEsquerda(inicial.getEsquerda()));
        return rotacaoDireita(inicial);
    }

    //RL → caso Right-Left (rotação direita-esquerda)
    public No duplaRotacaoDireitaEsquerda(No inicial) {
        inicial.setDireita(rotacaoDireita(inicial.getDireita()));
        return rotacaoEsquerda(inicial);
    }

    //==================================================================================================================

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //==============================Calculando Altura para auxiliar no Balanceamento====================================

    private int altura(No atual) {
        if (atual == null) {
            return -1;
        }

        if (atual.getEsquerda() == null && atual.getDireita() == null) {
            return 0;

        } else if (atual.getEsquerda() == null) {
            return 1 + altura(atual.getDireita());

        } else if (atual.getDireita() == null) {
            return 1 + altura(atual.getEsquerda());

        } else {
            return 1 + Math.max(altura(atual.getEsquerda()), altura(atual.getDireita()));
        }
    }

    private void setBalanceamento(No no) {
        no.setBalanceamento(altura(no.getDireita()) - altura(no.getEsquerda()));
    }

    //==================================================================================================================

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //===============================================Imprimindo em ordem================================================

    public void imprimirInterfixado() {
        imprimirInterfixado2(raiz);
    }

    private void imprimirInterfixado2(No v) {
        if (v!=null) {
            imprimirInterfixado2(v.getEsquerda());
            System.out.print(v.getValor() + " ");
            imprimirInterfixado2(v.getDireita());
        }
    }

    //==================================================================================================================

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    /*

    public void remover(int k) {
        removerAVL(this.raiz, k);
    }

    public void removerAVL(No atual, int k) {
        if (atual == null) {
            return;

        } else {

            if (atual.getValor() > k) {
                removerAVL(atual.getEsquerda(), k);

            } else if (atual.getValor() < k) {
                removerAVL(atual.getDireita(), k);

            } else if (atual.getValor() == k) {
                removerNoEncontrado(atual);
            }
        }
    }

    public void removerNoEncontrado(No aRemover) {
        No r;

        if (aRemover.getEsquerda() == null || aRemover.getDireita() == null) {

            if (aRemover.getPai() == null) {
                this.raiz = null;
                aRemover = null;
                return;
            }
            r = aRemover;

        } else {
            r = sucessor(aRemover);
            aRemover.setValor(r.getValor());
        }

        No p;
        if (r.getEsquerda() != null) {
            p = r.getEsquerda();
        } else {
            p = r.getDireita();
        }

        if (p != null) {
            p.setPai(r.getPai());
        }

        if (r.getPai() == null) {
            this.raiz = p;
        } else {
            if (r == r.getPai().getEsquerda()) {
                r.getPai().setEsquerda(p);
            } else {
                r.getPai().setDireita(p);
            }
            verificarBalanceamento(r.getPai());
        }
        r = null;
    }


    public No sucessor(No atual) {
        if (atual.getDireita() != null) {
            No sucessor = atual.getDireita();
            while (sucessor.getEsquerda() != null) {
                sucessor = sucessor.getEsquerda();
            }
            return sucessor;
        } else {
            No proximo = atual.getPai();
            while (proximo != null && atual == proximo.getDireita()) {
                atual = proximo;
                proximo = atual.getPai();
            }
            return proximo;
        }
    }

    */

    //==================================================================================================================
}
