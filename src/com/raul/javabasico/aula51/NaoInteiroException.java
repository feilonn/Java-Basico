package com.raul.javabasico.aula51;

public class NaoInteiroException extends Exception {
	
	int num;
	int denom;
	
	public NaoInteiroException(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}

	@Override
	public String toString() {
		
		return "Resultado de " + num + "/" + denom + " n�o � um n�mero inteiro!";
	}
	
	
}
