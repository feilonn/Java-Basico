package com.raul.javabasico.aula29;


public class CarConstructor {
	
	public static void main(String[] args) {
		
		Car aventador = new Car("Lamborghini", "Aventador", 380);
		
		System.out.println("BRAND = "+aventador.brand);
		System.out.println("NAME = "+aventador.name);
		System.out.println("VELOCITY = "+aventador.velocity);
		
		System.out.println();
		
		Car mustang = new Car("Ford", "Mustang Shelby GT", 340);
		
		System.out.println("BRAND = "+mustang.brand);
		System.out.println("NAME = "+mustang.name);
		System.out.println("VELOCITY = "+mustang.velocity);
		
	}
}
