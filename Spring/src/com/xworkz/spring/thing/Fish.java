package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Fish extends Object{
	public Fish() {
		super();
		System.out.println("Created Fish by Spring..");
	}

}
