package com.xworkz.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("engineerName")
	private String name;
	@Autowired
	@Qualifier("salaryEng")
	private long salary;
	@Autowired
	@Qualifier("company")
	private String companyName;
	@Autowired
	private int experience;
	
	public SoftwareEngineer() {
		System.out.println("Created softwareEngineer no-args const by spring..");
	}

	public String getName() {
		return name;
	}

	public long getSalary() {
		return salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getExperience() {
		return experience;
	}
	

}
