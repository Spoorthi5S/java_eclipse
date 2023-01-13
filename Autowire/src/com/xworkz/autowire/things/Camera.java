package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	@Autowired
	private Battery battery;

	public Camera() {
		System.out.println("Created camera default const by spring..");

	}
	
	public void checkPropertyRef() {
		System.out.println(this.battery.hashCode()+"hashcode of battery" + this.lens.hashCode()+"hashcode of lens");
	}

}
