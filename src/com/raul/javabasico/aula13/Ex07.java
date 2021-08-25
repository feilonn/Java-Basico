package com.raul.javabasico.aula13;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto tu ganha por hora? ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalha por mes? ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salario = ganhoHora * horasTrabalhadas;
		
		System.out.println("Seu salario é R$ "+salario);

	}

}
