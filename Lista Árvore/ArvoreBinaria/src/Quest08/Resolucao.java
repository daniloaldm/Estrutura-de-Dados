package Quest08;

public class Resolucao {

	public static void main(String[] args) {
		/*
		 * 
a) Se a altura h for 0, então temos precisamente um nó, a raiz. Além disso, esse nó também é um nó
externo e, portanto, o número de nós externos é pelo menos 1+0=1. 
Segue-se que o caso base é verdadeiro.
Supondo que o número mínimo de nós externos em uma árvore de altura h=k seja k+1.
Agora consideremos uma árvore T de altura h=k+1. Removendo todos os nós no nível k, conseguimos 
uma árvore T' de altura k e pela hipótese indutiva, existem pelo menos k+1 nós externos em T'.
Um nó externo de T é criado quando um nó é anexado a um nó externo de T'.
Para aumentar o nível de T' em um, precisamos anexar pelo menos dois nós para um nó no nível k.
Além disso, esses dois nós anexados se tornam nós externos, e ao mesmo tempo, o nó externo de
T' ao qual esses nós foram anexados torna-se um nó interno. Assim, o número total de nós externos 
em T é, pelo menos, k+1+2-1=k+2. Ao aplicar o segundo princípio da indução matemática, podemos 
concluir que o número total de nós externos em uma árvore de altura h é pelo menos h+1.

b) Mais uma vez, se a altura h de T for 0, então T tem precisamente um nó, isto é, a raiz. 
Além disso, este nó é também um nó externo e, portanto, o número de nós externos é no máximo 2^0=1. 
Segue-se que o caso base é verdadeiro.
Supondo que o número máximo de nós externos em uma árvore de altura h=k é 2^k. 
Agora consideremos uma árvore T de altura h=k+1. Removendo todos os nós no nível k+1, 
conseguimos uma árvore T' de altura k, e pela hipótese indutiva, existem no máximo 2^k nós externos em T'. 
Um nó externo de T é criado quando um nó é anexado a um nó externo de T'. Podemos anexar no máximo 2 
nós a cada nó externo de T' e, portanto, o número total de nós externos em T não pode exceder 2·2^k=2^k+1. 
Ao aplicar o segundo princípio da indução matemática, podemos concluir que o número total de nós 
externos em uma árvore de altura h é no máximo 2^h.
		 * 
		 */

	}

}
