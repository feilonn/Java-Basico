package com.raul.javabasico.aula43;

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
		
		public String toString() {
			String s = brand + "\n" + name + "\n" + people + "\n" + velocity + " km/h";
			return s;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((brand == null) ? 0 : brand.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + people;
			long temp;
			temp = Double.doubleToLongBits(velocity);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			Car other = (Car) obj;
			
			if(brand.equalsIgnoreCase(other.getBrand())) {
				return true;
			}
			return false;
		}
		
		
}
