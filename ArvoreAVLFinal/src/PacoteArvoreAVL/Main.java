package PacoteArvoreAVL;

public class Main {

    public static void main(String[] args){
        ArvoreAvl arvore1 = new ArvoreAvl();
        ArvoreAvl arvore2 = new ArvoreAvl();
        ArvoreAvl arvore3 = new ArvoreAvl();
        ArvoreAvl arvore4 = new ArvoreAvl();

        //Rotação à esquerda (RR)
        System.out.println("===========Árvore 1:===========");
        arvore1.insere(1);
        arvore1.insere(2);
        arvore1.insere(3);

        System.out.println();
        arvore1.imprimirInterfixado();
        System.out.println();
        System.out.println();

        //Rotação à direita (LL)
        System.out.println("===========Árvore 2:===========");
        arvore2.insere(30);
        arvore2.insere(20);
        arvore2.insere(10);

        System.out.println();
        arvore2.imprimirInterfixado();
        System.out.println();
        System.out.println();

        //Rotação Dupla à Direita(Rotação esquerda direita) (LR)

        System.out.println("===========Árvore 3:===========");
        arvore3.insere(30);
        arvore3.insere(20);
        arvore3.insere(21);

        System.out.println();
        arvore3.imprimirInterfixado();
        System.out.println();
        System.out.println();

        //Rotação Dupla à Esquerda(Rotação direita esquerda) (RL)

        System.out.println("===========Árvore 4:===========");
        arvore4.insere(30);
        arvore4.insere(33);
        arvore4.insere(32);

        System.out.println();
        arvore3.imprimirInterfixado();

    }
}
