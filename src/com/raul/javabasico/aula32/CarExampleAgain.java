package com.raul.javabasico.aula32;

public class CarExampleAgain {
	public static void main(String [] args) {
		
		Car skyline = new Car();
		
		skyline.setBrand("Nissan");
		skyline.setName("Skyline GTR");
		skyline.setPeople(2);
		skyline.setVelocity(315);
		
		System.out.println("BRAND = "+skyline.getBrand());
		System.out.println("NAME = "+skyline.getName());
		System.out.println("PEOPLE CAPACITY = "+skyline.getPeople());
		System.out.println("VELOCITY = "+skyline.getVelocity());
		
	}

}
