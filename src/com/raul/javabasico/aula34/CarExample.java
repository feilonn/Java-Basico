package com.raul.javabasico.aula34;

public class CarExample {

	public static void main(String[] args) {
		
		// Here we are not using static method
		Car supra = new Car();
		supra.setName("Supra");
		
		System.out.println(supra.niceCar(supra.getName()));
		
		//Using static method now
		
		System.out.println(Car.niceCar("SUPRA"));

	}

}
