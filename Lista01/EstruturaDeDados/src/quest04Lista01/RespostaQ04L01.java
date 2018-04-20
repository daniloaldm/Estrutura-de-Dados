package quest04Lista01;

public class RespostaQ04L01 {

	public static void main(String[] args) {
		System.out.println("	 * 	Operaçao		Saída			Conteúdo da pilha \n" + 
				"	 * push(5)			 -				(5)\n" + 
				"	 * push(3)			 -				(5,3)\n" + 
				"	 * pop()             3              (5)\n" + 
				"	 * push(2)           -              (5,2)\n" + 
				"	 * push(8)			 -				(5,2,8)\n" + 
				"	 * pop()			 8				(5,2)\n" + 
				"	 * pop()			 2				(5)\n" + 
				"	 * push(9)			 -				(5,9)\n" + 
				"	 * push(1)  		 -				(5,9,1)\n" + 
				"	 * pop				 1				(5,9)\n" + 
				"	 * push(7)			 -				(5,9,7)\n" + 
				"	 * push(6)			 -				(5,9,7,6)\n" + 
				"	 * pop()			 6				(5,9,7)\n" + 
				"	 * pop()			 7				(5,9)\n" + 
				"	 * push(4)			 -				(5,9,4)\n" + 
				"	 * pop()			 4				(5,9)\n" + 
				"	 * pop()			 8				(5)\n" + 
				"	 * \n" + 
				"	 * Lembrar do conceito de pilha, o primeiro a entrar é o ultimo a sair\n" + 
				"	 * e a pilha remove de cima para baixo.\n" + 
				"");

	}

}
