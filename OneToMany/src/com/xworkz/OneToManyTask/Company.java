package com.xworkz.OneToManyTask;

public class Company {
	public String name;
	public String ownerName;
	public Address address;

	public Company(String name, String ownerName) {
		super();
		this.name = name;
		this.ownerName=ownerName;
		
	}
	
	public void setCompany(Address address) {
		this.address=address;
	}
	
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
		System.out.println(this.address);
	}

}
