package com.xworkz.Bean.thing;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Rocket {
	
	@Value("India")
	private String country;
	@Value("Saturn_V")
	private String name;
	@Value("3690000")
	private double budget;

	public Rocket() {
		System.out.println("Created rocket using default const by spring...");

	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}


}
