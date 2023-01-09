package com.xworkz.spring2.things;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	public Laptop() {
		super();
		System.out.println("Created Laptop by Spring..");
	}
	
	public void see() {
		System.out.println("Are you seeing...?");
	}

}
