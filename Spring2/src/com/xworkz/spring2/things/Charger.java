package com.xworkz.spring2.things;

import org.springframework.stereotype.Component;

@Component
public class Charger {
	
	public Charger() {
		super();
		System.out.println("Created charger by spring..");
	}
	
	public void show() {
		System.out.println("charging...?");
	}

}
