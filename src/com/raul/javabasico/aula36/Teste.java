package com.raul.javabasico.aula36;

public class Teste {

	public static void main(String[] args) {

		
		Contact contact = new Contact();
		Adress adress = new Adress();
		Phone[] phones = new Phone[2]; // Array of contact phone numbers
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		
		adress.setStreetName("Baker Street");
		adress.setHouseNumber("221 B");
		adress.setCep("9999-999");
		
		phone1.setZoneCode("98");
		phone1.setPhoneNumber("99999-9999");
		
		phone2.setZoneCode("11");
		phone2.setPhoneNumber("98888-8888");
		
		contact.setName("Raul");
		//contact.setPhone("(98) 99999-9999");
		//contact.setAdress("Baker Street, Londres"); 
		contact.setAdress(adress);
		phones[0] = phone1;
		phones[1] = phone2;
		
		contact.setPhone(phones);
		
		System.out.println(contact.getName());
		if(contact != null && contact.getPhone() != null) {
			for(Phone p : contact.getPhone()) {
				System.out.println("("+p.getZoneCode()+")"+p.getPhoneNumber());
			}	
		}
		
		if(contact != null && contact.getAdress() != null) {
			System.out.println(contact.getAdress().getStreetName() + " - "+contact.getAdress().getHouseNumber());
			System.out.println(contact.getAdress().getCep());
		}
	}

}
