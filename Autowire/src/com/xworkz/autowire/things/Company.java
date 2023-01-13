package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;

	public Company() {
		System.out.println("Created company no-args const by spring..");
	}

	public void checkPropertyRef() {
		System.out.println(this.location.hashCode() + " hashcode of reffered company class");
	}

}
