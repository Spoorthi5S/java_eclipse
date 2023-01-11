package com.xworkz.autowire.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class KITCollege {
	@Autowired
	@Qualifier("collegeName")
	private String name;
	@Autowired
	private int branches;
	@Autowired
	private double fees;
	@Autowired
	private long branchStaff;
	@Autowired
	@Qualifier("inExam")
	private boolean strict;
	@Autowired
	private char section;
	@Autowired
	private float cgpa;
	@Autowired
	private short student;
	@Autowired
	private byte officeStaff;
	
	public KITCollege() {
		System.out.println("Created KITCollege no-args const by spring");
	}

	public String getName() {
		return name;
	}

	public int getBranches() {
		return branches;
	}

	public double getFees() {
		return fees;
	}

	public long getBranchStaff() {
		return branchStaff;
	}

	public boolean isStrict() {
		return strict;
	}

	public char getSection() {
		return section;
	}

	public float getCgpa() {
		return cgpa;
	}

	public short getStudent() {
		return student;
	}

	public byte getOfficeStaff() {
		return officeStaff;
	}

}
