package com.raul.javabasico.aula37;

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
}
