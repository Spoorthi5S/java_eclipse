package com.xworkz.copy;

public class PoliticalParty {

	public int members;
	public int Parties;
	public String country;

	public PoliticalParty(int members, int parties, String country) {
		super();
		this.members = members;
		this.Parties = parties;
		this.country = country;
	}
	
	public void display() {
		System.out.println(this.country);
		System.out.println(this.members);
		System.out.println(this.Parties);
	}

	public PoliticalParty() {
		super();
	}
	

}
