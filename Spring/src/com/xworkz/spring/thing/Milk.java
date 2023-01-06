package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Milk extends Object{
	
	public Milk() {
		super();
		System.out.println("Created Milk by Spring..");
	}

}
