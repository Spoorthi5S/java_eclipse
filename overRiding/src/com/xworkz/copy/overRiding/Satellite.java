package com.xworkz.copy.overRiding;

public class Satellite {

	public String name;
	public String mass;
	public String orbitalSpeed;

	public Satellite(String name, String mass, String orbitalSpeed) {
		super();
		this.name = name;
		this.mass = mass;
		this.orbitalSpeed = orbitalSpeed;
	}

	public Satellite() {
		super();
		
	}
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.mass);
		System.out.println(this.orbitalSpeed);
	}
	
	

}
