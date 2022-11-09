package com.xworkz.copy.overRiding;

public class Criminal {

	public String name;
	public int age;
	public String type;

	public Criminal() {
		super();
	}

	public Criminal(String name, int age, String type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public void display() {
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.type);
	}

}
