package com.xworkz.autowire.things;

import org.springframework.stereotype.Component;

@Component
public class Area {
	
	public Area() {
		System.out.println("Created area no-args cnst by spring");
	}

}
