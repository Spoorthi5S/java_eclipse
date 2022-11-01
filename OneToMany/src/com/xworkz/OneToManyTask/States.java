package com.xworkz.OneToManyTask;

public class States {

	public String name;
	public int noOfDistrict;
	public String chiefMinister;
	public String famousFor;

	public States(String name, int noOfDistrict, String chiefMinister, String famousFor) {
		super();
		this.name = name;
		this.noOfDistrict = noOfDistrict;
		this.chiefMinister = chiefMinister;
		this.famousFor = famousFor;
	}
	
	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.noOfDistrict);
		System.out.println(this.chiefMinister);
		System.out.println(this.famousFor);
	}
	
	
	

}
