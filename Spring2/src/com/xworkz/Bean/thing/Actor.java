package com.xworkz.Bean.thing;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;
@Component
public class Actor {
	
	private String name;
	private String language;
	private int age;

	public Actor(@Value("RockingStarYash") String name, @Value("Kannada") String language, @Value("37") int age) {
		this.name = name;
		this.language = language;
		this.age = age;
		System.out.println("Running Actor...");
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public int getAge() {
		return age;
	}

}
