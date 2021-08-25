package com.raul.javabasico.aula13;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// Convert Farenheit to Celsius
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the Farenheit: ");
		float farenheit = scan.nextFloat();
		
		float celsius = (5 * (farenheit - 32)/9);
		
		System.out.println(farenheit+" farenheit = "+celsius+" celsius.");
		

	}

}
