package com.xworkz.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberType")
	private String type;
	@Autowired
	private int duddu;
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	@Autowired
	@Qualifier("sharpRubber")
	private Boolean sharp;
	@Autowired
	@Qualifier("stolened")
	private Boolean Stolen;
	@Autowired
	@Qualifier("small")
	private String size;
	
	public Rubber() {
		System.out.println("Created rubber by spring");
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getDuddu() {
		return duddu;
	}

	public String getColor() {
		return color;
	}

	public Boolean getSharp() {
		return sharp;
	}

	public Boolean getStolen() {
		return Stolen;
	}

	public String getSize() {
		return size;
	}

}
