package com.raul.javabasico.aula37;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		aluno.setNome("Raul");
		aluno.setCpf("999.999.999-99");
		aluno.setEndereco("Baker Street");
		aluno.setTelefone("(88)98888-8888");
		
		Professor professor = new Professor();
		professor.setNome("Cremildo");
		professor.setCpf("888.888.888-88");
		professor.setEndereco("Rua do Arroz");
		professor.setTelefone("(11)77777-7777");
		
		aluno.mostraInfor();
		System.out.println();
		professor.mostraInfor();
	}

}
