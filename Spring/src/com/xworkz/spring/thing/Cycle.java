package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Cycle extends Object{
	
	public Cycle() {
		super();
		System.out.println("Created Cycle by spring...");
	}

}
