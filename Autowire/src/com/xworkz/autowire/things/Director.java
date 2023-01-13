package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experience experience;
	
	public Director() {
		System.out.println("Created Director const by spring");
	}
	
	public void checkPropertyRef()
	{
		System.out.println(this.experience.hashCode()+"hashcode of exp...");
	}
}
