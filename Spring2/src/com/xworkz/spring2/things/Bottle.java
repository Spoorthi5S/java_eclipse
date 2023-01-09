package com.xworkz.spring2.things;

import org.springframework.stereotype.Component;

@Component
public class Bottle {
	
	public Bottle() {
		super();
		System.out.println("Created bottle by Spring..");
	
	}
	
	public void show() {
		System.out.println("showing bottle..." );
	}

}
