package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {
	@Autowired
	private Battery battery;

	public Lens() {
		System.out.println("created Lens const...");
	}

}
