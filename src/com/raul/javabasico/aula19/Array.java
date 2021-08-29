package com.raul.javabasico.aula19;

public class Array {

	public static void main(String[] args) {
		
		int[] dogsAge = new int[10];
		
		dogsAge[0] = 5;
		dogsAge[1] = 8;
		dogsAge[2] = 2;
		dogsAge[3] = 11;
		dogsAge[4] = 1;
		dogsAge[5] = 13;
		dogsAge[6] = 3;
		
		for(int i = 0; i < dogsAge.length; i++) {
			System.out.println("The dog of code = "+(i+1)+" have "+dogsAge[i]+" years old.");
		}
		
		System.out.println("\nAnother way...\n");
		
		int cont = 0;
		
		for(int dog : dogsAge) {
			cont++;
			System.out.println("The dog of code = "+(cont)+" have "+dog+" years old.");
		}

	}

}
