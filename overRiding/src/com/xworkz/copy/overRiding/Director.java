package com.xworkz.copy.overRiding;

public class Director {

	public String name;
	public int age;
	public String HomeTown;

	public Director(String name, int age, String homeTown) {
		super();
		this.name = name;
		this.age = age;
		HomeTown = homeTown;
	}
	
	public void display() {
		System.out.println(this.age);
		System.out.println(this.HomeTown);
		System.out.println(this.name);
	}

	public Director() {
		super();
	}
	

}
