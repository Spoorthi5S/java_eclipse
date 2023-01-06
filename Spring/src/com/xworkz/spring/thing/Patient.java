package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Patient extends Object{
	
	public Patient() {
		super();
		System.out.println("Created Patient by Spring..");
	}

}
