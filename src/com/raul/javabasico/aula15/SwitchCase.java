package com.raul.javabasico.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the number of the day of the week: ");
		int dayOfWeek = scan.nextInt();
		
		switch(dayOfWeek){
			case(1): System.out.println("It's Sunday!"); break;
			case(2): System.out.println("It's Monday!"); break;
			case(3): System.out.println("It's Tuesday!"); break;
			case(4): System.out.println("It's Wednesday!"); break;
			case(5): System.out.println("It's Thursday!"); break;
			case(6): System.out.println("It's Friday!"); break;
			case(7): System.out.println("It's Saturday!"); break;
			default: System.out.println("The day "+dayOfWeek+" doesn't exists!");
		}

	}

}
