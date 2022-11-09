package com.xworkz.copy.overRiding;

public class Prasanth extends Director{
	public int movies;
	
	public Prasanth(String name, int age, String homeTown, int movies) {
		super(name, age, homeTown);
		this.movies=movies;
	}

	

	public Prasanth() {
		super();
		
	}
	public void display() {
		System.out.println(this.age);
		System.out.println(this.HomeTown);
		System.out.println(this.movies);
		System.out.println(this.name);
	}

	

}
