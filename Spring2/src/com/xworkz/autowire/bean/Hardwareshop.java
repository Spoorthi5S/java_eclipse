package com.xworkz.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hardwareshop {
	@Autowired
	@Qualifier("title")
	private String name;
	@Autowired
	@Qualifier("number")
	private int id;
	@Autowired
	@Qualifier("gstnumber")
	private String gstNo;
	@Autowired
	@Qualifier("owner")
	private String ownerName;
	@Autowired
	@Qualifier("situated")
	private String address;
	
	public Hardwareshop() {
		System.out.println("Created Hardwareshop default constructor by spring..");
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getGstNo() {
		return gstNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getAddress() {
		return address;
	}	

}
