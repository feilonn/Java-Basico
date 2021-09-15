package com.raul.javabasico.aula40;

public class Professor extends Pessoa {
	
	private String curso;
	private double salario;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalarioLiquido() {
		
		return 0;
	}
	
	public void mostraInfor() {
		System.out.println("NOME DO PROFESSOR = "+this.getNome()+";");
		System.out.println("ENDEREÇO DO PROFESSOR  = "+this.getEndereco()+";");
		System.out.println("TELEFONE DO PROFESSOR  = "+this.getTelefone()+";");
		System.out.println("CPF DO PROFESSOR  = "+this.getCpf()+";");
	}
}
