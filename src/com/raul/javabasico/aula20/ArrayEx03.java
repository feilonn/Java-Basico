package com.raul.javabasico.aula20;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arrayA = new int[5];
		int[] arrayB = new int[arrayA.length];
		int[] arrayC = new int[arrayA.length];
		
		for(int i = 0; i < arrayA.length; i++) {
			System.out.println("Insert the "+(i+1)+"ª value of the array A: ");
			arrayA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < arrayA.length; i++) {
			System.out.println("Insert the "+(i+1)+"ª value of the array B: ");
			arrayB[i] = scan.nextInt();
			arrayC[i] = arrayA[i] * arrayB[i];
		}
		
		System.out.print("Array A = ");
		for(int i = 0; i < arrayA.length; i++) {
			System.out.print(+arrayA[i]+" ");
		}
		
		System.out.print("\nArray B = ");
		for(int i = 0; i < arrayA.length; i++) {
			System.out.print(+arrayB[i]+" ");
		}
		
		System.out.print("\nArray C = ");
		for(int i = 0; i < arrayA.length; i++) {
			System.out.print(+arrayC[i]+" ");
		}
	}

}
