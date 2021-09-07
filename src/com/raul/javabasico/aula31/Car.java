package com.raul.javabasico.aula31;

public class Car {
	
	public String brand;
	
	private String name;
	
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
	
	public Car(String brand, String name, double velocity) {
		this.brand = brand;
		this.name = name;
		this.velocity = velocity;
	}
}
