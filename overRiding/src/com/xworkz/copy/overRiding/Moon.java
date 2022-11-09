package com.xworkz.copy.overRiding;

public class Moon extends Satellite{
	
	public String alternativeName;

	public Moon() {
		super();
		
	}

	public Moon(String name, String mass, String orbitalSpeed, String alternativeName) {
		super(name, mass, orbitalSpeed);
		this.alternativeName=alternativeName;
	}
	
	public void showOff() {
		System.out.println(this.alternativeName);
		System.out.println(this.mass);
		System.out.println(this.name);
		System.out.println(this.orbitalSpeed);
	}
	

}
