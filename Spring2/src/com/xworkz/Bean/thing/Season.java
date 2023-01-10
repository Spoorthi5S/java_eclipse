package com.xworkz.Bean.thing;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private double duration;
	private String startingMonth;

	public Season() {
		System.out.println("Created Season default const by spring..");
	}

	public String getName() {
		return name;
	}

	@Value("Spring")
	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	@Value("2")
	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("March")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
