package com.raul.javabasico.aula52;

public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		return "A agenda está cheia!";
	}
}
