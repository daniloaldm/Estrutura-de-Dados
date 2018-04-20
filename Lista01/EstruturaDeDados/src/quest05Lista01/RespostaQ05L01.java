package quest05Lista01;

public class RespostaQ05L01 {

	public static void main(String[] args) {
		System.out.println("	 * Operação			  Saída			Fila\n" + 
				"	 * enqueue(5)			-			(5)\n" + 
				"	 * enqueue(3) 			-			(5,3)\n" + 
				"	 * dequeue()			5			(3)\n" + 
				"	 * enqueue(2)			-			(3,2)\n" + 
				"	 * enqueue(8)			- 			(3,2,8)\n" + 
				"	 * dequeue()			3			(2,8)\n" + 
				"	 * dequeue()			2			(8)\n" + 
				"	 * enqueue(9)			-			(8,9)\n" + 
				"	 * enqueue(1)			-			(8,9,1)\n" + 
				"	 * dequeue()			8			(9,1)\n" + 
				"	 * enqueue(7)			-			(9,1,7)\n" + 
				"	 * enqueue(6)			-			(9,1,7,6)\n" + 
				"	 * dequeue()			9			(1,7,6)\n" + 
				"	 * dequeue()			1			(7,6)\n" + 
				"	 * enqueue(4)			-			(7,6,4)\n" + 
				"	 * dequeue()			7			(6,4)\n" + 
				"	 * dequeue()			6			(4)\n" + 
				"	 * \n" + 
				"	 * Fila basta lembrar da fila de um banco vai chegando as pessoas\n" + 
				"	 * formando uma fila (se formando um parado atras do outro) ao\n" + 
				"	 * decorrer que é chamado pelos guiches o primero da fila sai\n" + 
				"	 * então a priore o primeiro que chega na fila é o primeiro que sai\n" + 
				"	 * (primeiro a ser chamado pelo guiche)\n" + 
				"");

	}

}
