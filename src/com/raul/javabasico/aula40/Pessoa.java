package com.raul.javabasico.aula40;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void mostraInfor() {
		System.out.println("NOME = "+this.getNome()+";");
		System.out.println("ENDEREÇO = "+this.getEndereco()+";");
		System.out.println("TELEFONE = "+this.getTelefone()+";");
		System.out.println("CPF = "+this.getCpf()+";");
	}

}
