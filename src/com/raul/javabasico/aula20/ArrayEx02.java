package com.raul.javabasico.aula20;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arrayA = new int[5];
		int[] arrayB = new int[arrayA.length];
		
		for(int i = 0; i < arrayA.length; i++) {
			System.out.println("Insert the "+(i+1)+"ª value of the array: ");
			arrayA[i] = scan.nextInt();
			arrayB[i] = arrayA[i] * (i+1);
		}
		
		System.out.print("Array A = ");
		for(int i = 0; i < arrayA.length; i++) {
			System.out.print(+arrayA[i]+" ");
		}
		
		System.out.print("\nArray B = ");
		for(int i = 0; i < arrayA.length; i++) {
			System.out.print(+arrayB[i]+" ");
		}

	}

}
