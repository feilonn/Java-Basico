package com.raul.javabasico.aula40;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	double calcularMedia() {
		
		return 0;
	}
	
	public void mostraInfor() {
		System.out.println("NOME DO ALUNO = "+this.getNome()+";");
		System.out.println("ENDEREÇO DO ALUNO = "+this.getEndereco()+";");
		System.out.println("TELEFONE DO ALUNO = "+this.getTelefone()+";");
		System.out.println("CPF DO ALUNO = "+this.getCpf()+";");
	}
	
}
