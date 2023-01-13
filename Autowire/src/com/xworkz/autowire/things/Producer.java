package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	private Assistant assistant;
	@Autowired
	private Company company;
	
	public Producer() {
		System.out.println("Created producer default const by spring..");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.assistant.hashCode() + "hashcode of Assistant" + this.company.hashCode() + "hashcode of company");
	}

}
