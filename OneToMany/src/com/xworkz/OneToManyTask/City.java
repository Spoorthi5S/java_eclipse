package com.xworkz.OneToManyTask;

public class City {

	public String cityName;
	public boolean smartCity;
	public int streetNo;
	public double population;

	public City(String cityName, boolean smartCity, int streetNo, double population) {
		super();
		this.cityName = cityName;
		this.smartCity = smartCity;
		this.streetNo = streetNo;
		this.population = population;
	}
	
	public void showOff() {
		System.out.println(this.cityName);
		System.out.println(this.smartCity);
		System.out.println(this.streetNo);
		System.out.println(this.population);
	}

}
