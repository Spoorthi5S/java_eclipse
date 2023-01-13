package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {

	@Autowired
	private Company company;

	public Assistant() {
		System.out.println("Created Assistant default const by spring..");
	}

}
