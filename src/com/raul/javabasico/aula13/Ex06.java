package com.raul.javabasico.aula13;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//Calculate circle area
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Radius: ");
		
		double radius = scan.nextDouble();
		
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Area = "+area);

	}

}
