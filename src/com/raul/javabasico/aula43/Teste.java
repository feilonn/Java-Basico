package com.raul.javabasico.aula43;

public class Teste {

	public static void main(String[] args) {

		Car car = new Car();
		
		car.setBrand("Nissan");
		car.setName("350Z");
		car.setPeople(2);
		car.setVelocity(250);
		
		Car car2 = new Car();
		car2.setBrand("Nissan");
		car2.setName("Silvia");
		car2.setPeople(4);
		car2.setVelocity(249.45);

		System.out.println(car);
		System.out.println("\n"+car2);
		System.out.println("\n"+car.equals(car2));
	}

}
