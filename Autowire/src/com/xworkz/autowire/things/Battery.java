package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	@Autowired
	private Capacity capacity;

	public Battery() {
		System.out.println("battery const by spring");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.capacity.hashCode() + "hashcode of capacity");
	}

}
