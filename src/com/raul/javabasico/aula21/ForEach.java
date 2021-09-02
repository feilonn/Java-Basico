package com.raul.javabasico.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		int[][] matrix = new int[2][2];
		
		Random random = new Random();
		
		//Array example
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}
		
		for(int item : array) {
			System.out.print(item+" ");
		}
		
		//Matrix example
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				matrix[i][j] = random.nextInt(20);
			}
		}
		
		System.out.println("\n");
		for(int[] matrixLine : matrix) {//Iterate matrix line
			for(int matrixColumn : matrixLine) {//Iterate matrix column
				System.out.print(matrixColumn+" ");//show the element of the matrix
			}System.out.println();
		}
	}

}
