package com.raul.javabasico.aula25;

import java.text.DecimalFormat;

import com.raul.javabasico.aula25.Car;

public class CarMethodExample {

	public static void main(String[] args) {
		Car aventador = new Car();
		
		double km = 10;
		
		DecimalFormat df = new DecimalFormat("0.##");
		
		aventador.brand = "Lamborghini";
		aventador.name = "Aventador";
		aventador.people = 2;
		aventador.velocity = 350;
		aventador.consume = 3.3;
		aventador.gasCapacity = 85;
		
		double liters = aventador.amountFuel(km);
		String litersFormated = df.format(liters);
		
		aventador.showConfort();
		
		System.out.println("The lamborghini aventador has an autonomy = "+aventador.getAutonomy()+" Km");
		
		System.out.println("To run "+km+" Km, you'll need "+litersFormated+"L of gasoline.");

	}

}
