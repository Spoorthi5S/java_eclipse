package com.xworkz.spring2.things;

import org.springframework.stereotype.Component;

@Component
public class Bedsheet {
	public Bedsheet() {
		super();
		System.out.println("Created bedsheet by spring..");
	}
	public void see() {
		System.out.println("seeing....?");
	}

}
