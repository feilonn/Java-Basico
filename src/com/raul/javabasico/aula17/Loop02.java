package com.raul.javabasico.aula17;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String password, user;
		
		System.out.println("User: ");
		user = scan.nextLine();
		
		do {
			System.out.println("Password: ");
			password = scan.nextLine();
			
			if(password.equals(user)) {
				System.out.println("The username and the password can't be equals for security reasons. \nPlease, insert it correctly.");
			}
			
		}while(user.equals(password));
		
		System.out.println("Sucessfully!");

	}

}
