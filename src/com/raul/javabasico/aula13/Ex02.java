package com.raul.javabasico.aula13;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um numero: ");
		numero = scan.nextInt();
		
		int numeroDois;
		
		System.out.println("Informe outro numero: ");
		numeroDois = scan.nextInt();
		
		int soma = numero + numeroDois;
		
		System.out.println("A soma dos numeros é "+soma);
		

	}

}
