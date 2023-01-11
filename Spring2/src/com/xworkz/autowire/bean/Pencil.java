package com.xworkz.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("pencilType")
	private String type;
	@Autowired
	private int price;
	@Autowired
	@Qualifier("pencilColor")
	private String color;
	@Autowired
	@Qualifier("sharpPencil")
	private Boolean sharp;
	@Autowired
	@Qualifier("notStolen")
	private Boolean Stolen;
	
	public Pencil() {
		System.out.println("Created Pencil no-args const by spring");
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getPrice() {
		return price;
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

}
