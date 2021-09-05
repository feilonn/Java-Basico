package com.raul.javabasico.aula25;

public class Car {
	
	String brand;
	
	String name;
	
	int people;
	
	double velocity;
	
	double consume;
	
	double gasCapacity;
	
	void showConfort() {
		System.out.println("\nConfortable for 2 people.");
	}
	
	double getAutonomy() {
		return consume * gasCapacity;
	}
	
	double amountFuel (double km) {
		return km/consume;
	}
}
