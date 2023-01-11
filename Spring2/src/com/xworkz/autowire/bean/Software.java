package com.xworkz.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("names")
	private String name;
	@Autowired
	@Qualifier("softwareVersion")
	private Double Version;
	@Autowired
	@Qualifier("DeveloperName")
	private String Developer;
	@Autowired
	private int date;
	@Autowired
	@Qualifier("freeSource")
	private Boolean free;
	
	public Software() {
		System.out.println("Created Software no-args const by spring..");	
	}

	public String getName() {
		return name;
	}

	public Double getVersion() {
		return Version;
	}

	public String getDeveloper() {
		return Developer;
	}

	public int getDate() {
		return date;
	}

	public Boolean getFree() {
		return free;
	}

}
