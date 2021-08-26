package com.raul.javabasico.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert price: ");
		double price = scan.nextDouble();
		
		if(price >= 20) {
			System.out.println("No Way!");
		}else if(price >= 15 && price < 20) {
			System.out.println("Negociate it!");
		}else {
			System.out.println("Cheap, get it!");
		};

	}

}
