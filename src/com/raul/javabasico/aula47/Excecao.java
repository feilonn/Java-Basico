package com.raul.javabasico.aula47;

public class Excecao {

	public static void main(String[] args) {
		
		try {
		
		
			int [] vetor = new int[4];
			
			System.out.println("Antes da exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto n�o ser� impresso");
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Erro ao acessar posi��o inexistente no array!");
		}
		
		System.out.println("Texto impresso ap�s a exception");
	}

}
