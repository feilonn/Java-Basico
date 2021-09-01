package com.raul.javabasico.aula20;

import java.util.Scanner;

public class MatrixEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numLines = 3;
		int numColumns = 3;
		int qtdePar = 0;
		int qtdeImpar = 0;
		
		int[][] matriz = new int[numLines][numColumns];
		
		for(int i = 0; i < numLines; i++) {
			for(int j = 0; j < numColumns; j++) {
				System.out.println("Informe o elemento de posição["+i+"]["+j+"]: ");
				matriz[i][j] = scan.nextInt();
				if(matriz[i][j] % 2 == 0) {
					qtdePar++;
				}else {
					qtdeImpar++;
				}
			}
		}
		
		System.out.println("Matriz:\n");
		for(int i = 0; i < numLines; i++) {
			for(int j = 0; j < numColumns; j++) {
				System.out.print(matriz[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("\nQuantidade de numeros pares = "+qtdePar);
		System.out.println("Quantidade de numeros ímpares = "+qtdeImpar);
		
		
	}
}
