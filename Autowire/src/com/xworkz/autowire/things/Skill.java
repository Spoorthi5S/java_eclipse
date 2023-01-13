package com.xworkz.autowire.things;

import org.springframework.stereotype.Component;

@Component
public class Skill {
	
	public Skill() {
		System.out.println("Created skill by spring");
	}

}
