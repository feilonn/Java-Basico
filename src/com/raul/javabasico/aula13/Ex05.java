package com.raul.javabasico.aula13;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// Convert meter to centimeter
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter with the size (m): ");
		
		float meters = scan.nextFloat();
		
		float converter = meters*100;
		
		System.out.println("Converter: "+converter+"cm");

	}

}
