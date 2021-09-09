package com.raul.javabasico.aula34;

public class countExample {

	public static void main(String[] args) {
		 
		Count.showCount();
		Count.increment();
		Count.increment();
		Count.showCount();
		Count.decrement();
		Count.showCount();
		
		Count myCount = new Count();
		
		myCount.increment();
		myCount.increment();
		myCount.showCount();
		
		Count.decrement();
		
		myCount.showCount();
		myCount.decrement();
		myCount.showCount();

	}

}
