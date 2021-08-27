package com.raul.javabasico.aula16;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int max = 10;
		
		while(i <= max) {
			System.out.println("i = "+i);
			i++;
		};
		
		System.out.println();
		
		do {
			i++;
			System.out.println("i = "+i);			
		}while(i < 15);

	}

}
