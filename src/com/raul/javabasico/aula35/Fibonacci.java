package com.raul.javabasico.aula35;

public class Fibonacci {
	public static int myFibonacci(int num) {
		if(num < 2) {
			return 1;
		}
		
		return myFibonacci(num - 1) + myFibonacci(num - 2);
	}
}
