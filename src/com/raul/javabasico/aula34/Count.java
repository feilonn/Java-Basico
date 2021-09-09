package com.raul.javabasico.aula34;

public class Count {
	
	private static int myCount;
	
	public Count() {
		
	}
	
	public static void increment() {
		myCount++;
	}
	
	public static void decrement() {
		myCount--;
	}
	
	public static void showCount() {
		System.out.println("\n COUNT = "+myCount);
	}
}
