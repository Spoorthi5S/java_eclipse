package com.xworkz.OneToManyTask;

public class Location {

	public int no;
	public String street;
	public City city;
	public States state;
	public Country country;

	public Location(int no, String street) {
		this.no = no;
		this.street = street;
		
	}
	
	public void setCity(City city) {
		System.out.println("City setted");
		this.city=city;
	
	}
	public void setStates(States state) {
		System.out.println("state setted");
		this.state=state;
	}
	public void setCountry(Country country) {
		System.out.println("country setted");
		this.country=country;
	}
	public void showOff() {
		System.out.println(this.no);
		System.out.println(this.street);
		System.out.println(this.city);
		System.out.println(this.state);
		System.out.println(this.country);
	}

}
