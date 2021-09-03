package com.raul.javabasico.aula24;

public class CarExample {

	public static void main(String[] args) {
		
		Car aventador = new Car();
		
		aventador.brand = "Lamborghini";
		aventador.name = "Aventador";
		aventador.people = 2;
		aventador.velocity = 350;

		System.out.println("Car brand: "+aventador.brand);
		System.out.println("Model/Name: "+aventador.name);
		System.out.println("People Capacity: "+aventador.people);
		System.out.println("Max speed: "+aventador.velocity+"Km/h");
		
		System.out.println();
		
		Car mustang= new Car();
		
		mustang.brand = "Ford";
		mustang.name = "Mustang Shelby GT";
		mustang.people = 4;
		mustang.velocity = 321;
		
		System.out.println("Car brand: "+mustang.brand);
		System.out.println("Model/Name: "+mustang.name);
		System.out.println("People Capacity: "+mustang.people);
		System.out.println("Max speed: "+mustang.velocity+"Km/h");
	}

}
