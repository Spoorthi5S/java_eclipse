package com.xworkz.copy.overRiding;

public class Ravi extends Criminal{
	
	public String HomeTown;

	public Ravi() {
		super();
	}

	public Ravi(String name, int age, String type, String HomeTown) {
		super(name, age, type);
		this.HomeTown=HomeTown;
	}
	public void display() {
		System.out.println(this.age);
		System.out.println(this.HomeTown);
		System.out.println(this.type);
		System.out.println(this.name);
	}
	
	

}
