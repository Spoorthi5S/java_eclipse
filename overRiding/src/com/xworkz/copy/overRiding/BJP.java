package com.xworkz.copy.overRiding;

import com.xworkz.copy.PoliticalParty;

public class BJP extends PoliticalParty{
	public String ChiefMinister;

	public BJP() {
		super();
		
	}

	public BJP(int members, int parties, String country, String ChiefMinister) {
		super(members, parties, country);
		this.ChiefMinister=ChiefMinister;
	}
	public void display() {
		System.out.println(this.ChiefMinister);
		System.out.println(this.country);
		System.out.println(this.members);
		System.out.println(this.Parties);
	}
	
	
	

}
