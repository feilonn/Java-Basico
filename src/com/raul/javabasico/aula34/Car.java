package com.raul.javabasico.aula34;

public class Car {
	
		private String brand;
		
		private String name;
		
		private int people;
		
		private double velocity;
		
		private double consume;
		
		private double gasCapacity;

		//Getters and Setters - Encapsulation
		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPeople() {
			return people;
		}

		public void setPeople(int people) {
			this.people = people;
		}

		public double getVelocity() {
			return velocity;
		}

		public void setVelocity(double velocity) {
			this.velocity = velocity;
		}

		public double getConsume() {
			return consume;
		}

		public void setConsume(double consume) {
			this.consume = consume;
		}

		public double getGasCapacity() {
			return gasCapacity;
		}

		public void setGasCapacity(double gasCapacity) {
			this.gasCapacity = gasCapacity;
		}
		
		public static String niceCar (String name) {
			return "Hey! Nice "+name+" :)";
		}
}
