package com.xworkz.OneToManyTask;

public class Address {
	public Location location;
	
	public void setLocation(Location location) {
		this.location=location;
	}
	
	public void showOff() {
		System.out.println(this.location);
	}
	

}
