package com.xworkz.OneToManyTask;

public class Job {

	public double salary;
	public String role;
	public boolean bond;
	public Company company;

	public Job(double salary, String role, boolean bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}
	
	public void setCompany(Company company) {
		this.company=company;
	}
	
	public void showOff() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		System.out.println(this.company);
	}

}
