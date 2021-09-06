package com.raul.javabasico.aula29;

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
	
	double showAutonomy() {
		return consume * gasCapacity;
	}
	
	double amountFuel (double km) {
		return km/consume;
	}
	
	public Car() {
		
	}
	
	public Car(String brand_, String name_, double velocity_) {
		brand = brand_;
		name = name_;
		velocity = velocity_;
	}
	
}
