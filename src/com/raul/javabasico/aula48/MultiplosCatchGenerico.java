package com.raul.javabasico.aula48;

public class MultiplosCatchGenerico {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i]+"/"+denom[i]+" = "+numeros[i]/denom[i]);
			}catch(ArithmeticException exception){
				System.err.println("Erro ao dividir numero por zero!");
			}catch(Throwable exception){
				System.err.println("Ocorreu um erro!");
			}
		}

	}
}
