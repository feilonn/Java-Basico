package com.raul.javabasico.aula36;

public class Contact {
	
	private String name;
	private Phone[] phone;
	private Adress adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Phone[] getPhone() {
		return phone;
	}
	public void setPhone(Phone[] phone) {
		this.phone = phone;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
}
