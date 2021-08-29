package com.raul.javabasico.aula17;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert a number between 0 and 10: ");
		double number1 = scan.nextDouble();
		
		while(number1 < 0 || number1 > 10) {
			System.err.println("Error! Please Insert a number between 0 and 10: ");
			number1 = scan.nextDouble();
		}
		
		System.out.println("Congratulations, number = "+number1);

	}

}
