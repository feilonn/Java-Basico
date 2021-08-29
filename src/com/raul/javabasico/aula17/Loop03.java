package com.raul.javabasico.aula17;

public class Loop03 {

	public static void main(String[] args) {
		
		double countryA = 80000;
		double percentA = 0.03;
		
		double countryB = 200000;
		double percentB = 0.015;
		
		double years = 0;
		
		while(countryA < countryB) {
			countryA += countryA * percentA;
			countryB += countryB * percentB;
			years++;
		}
		
		System.out.println("Country A will have the largest population in "+years+" year");
		
		System.out.println("Country A Population = "+countryA+" in "+years+" years.");
		System.out.println("Country B Population = "+countryB+" in "+years+" years.");
	}

}
