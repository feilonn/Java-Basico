package com.raul.javabasico.aula52;

public class ContatoNaoExisteException extends Exception{
	
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
		return "O contato de nome "+this.nomeContato+" não existe na agenda!";
	}
}
