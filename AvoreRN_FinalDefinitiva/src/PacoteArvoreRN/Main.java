package PacoteArvoreRN;

public class Main{
    public static void main(String[] args){

        ArvoreRN arvore = new ArvoreRN(10);

        arvore.insere(12);
        arvore.insere(9);
        arvore.insere(8);

        arvore.encontra(9);
        arvore.encontra(33);

        System.out.println();

        arvore.raiz.print();

    }
}
