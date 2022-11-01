package com.xworkz.OneToManyTask;

public class Country {
	
	public String name;
	public int NoOfStates;
	public String countryCode;
	public boolean developed;
	
	public Country(String name,int NoOfStates,String countryCode,boolean developed)
	{
		this.name=name;
		this.NoOfStates=NoOfStates;
		this.countryCode=countryCode;
		this.developed=developed;
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.NoOfStates);
		System.out.println(this.countryCode);
		System.out.println(this.developed);
	}

}
