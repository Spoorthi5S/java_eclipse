package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Application extends Object{
	
	public Application() {
		super();
		System.out.println("Created Application by Spring..");
	}

}
