package com.raul.javabasico.aula12;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Your full name: ");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Your first name: ");
		String primeiroNome = scan.next();
		
		System.out.println("Hi, your first name is "+primeiroNome+"\nAnd your full name is "+nomeCompleto);
	}

}
