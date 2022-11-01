package com.xworkz.OneToManyTask;

public class Email {

	public String id;
	public String password;
	public double mobileNo;
	public Company company;

	public Email(String id, String password, double mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	
	public void setCompany(Company company) {
		this.company=company;
	}
	
	public void showOff() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		System.out.println(this.company);
	}

}
