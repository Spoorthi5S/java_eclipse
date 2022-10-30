package com.xworkz.OneToMany;

public class City {
	
	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;
	
	public City(Name name) {
		this.name=name;
	}
	
	public void setCapital(boolean capital) {
		this.capital=capital;
	}
	
	public void setAreaInSquareKilometers(double areaInSquareKilometers) {
		this.areaInSquareKilometers=areaInSquareKilometers;
	}
	

	public void display() {
		System.out.println("Displaying city");
		System.out.println(this.areaInSquareKilometers);
		System.out.println(this.capital);
		if(this.name!=null) {
		System.out.println(this.name);
		this.name.display();
		
	}
	}
}

	

	


