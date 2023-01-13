package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	@Autowired
	private Area area;
	
	public Location() {
		System.out.println("Created location no-args const by spring..");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.area.hashCode()+ "hashCode of reffered location class property");
	}

}
