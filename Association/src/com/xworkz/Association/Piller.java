package com.xworkz.Association;

public class Piller {
	public int id;
	public String place;
	public Shape shape = Shape.round;
	public double height;
	public boolean supporting;
	public Company company = new Company("Tata", "Construction");

	public void Pillar(int id, String place, double height, boolean supporting) {
		this.id = id;
		this.place = place;
		this.supporting = supporting;
	}

	public void showOff() {
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.supporting);
		System.out.println(shape);
		System.out.println(company.name);
	}


}
