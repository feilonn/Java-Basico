package com.raul.javabasico.aula51;

public class UsandoMinhaException {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int[] numeros = {4, 8, 5, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 4};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {
					throw new NaoInteiroException(numeros[i], denom[i]);
				}
				System.out.println(numeros[i]+"/"+denom[i]+" = "+numeros[i]/denom[i]);
			}catch(ArrayIndexOutOfBoundsException | ArithmeticException | NaoInteiroException exception ){
				System.err.println("Ocorreu um erro!");
				exception.printStackTrace();
			}
		}

	}

}
