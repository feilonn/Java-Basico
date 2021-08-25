package com.raul.javabasico.aula13;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota do aluno: ");
		float notaUm = scan.nextFloat();
		
		System.out.println("Informe a segunda nota do aluno: ");
		float notaDois = scan.nextFloat();
		
		System.out.println("Informe a terceira nota do aluno: ");
		float notaTres = scan.nextFloat();
		
		float media = (notaUm+notaDois+notaTres)/3;
				
		System.out.println("A media das notas é = "+media);

	}

}
