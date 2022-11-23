package com.xworkz.equals;

public class Institution {
	
	private String name;
	private int    noOfStudents;
	private String hrName;
	private String Chairmen;
	private int    noOfStaffs;
	private String location;
	private double fee;
	private String fundsName;
	private String topperName;
	private String javaTeacherName;
	
	public Institution(String name, int noOfStudents, String hrName, String chairmen, int noOfStaffs,
			String location, double fee, String fundsName, String topperName, String javaTeacherName) {
		super();
		this.name = name;
		this.noOfStudents = noOfStudents;
		this.hrName = hrName;
		Chairmen = chairmen;
		this.noOfStaffs = noOfStaffs;
		this.location = location;
		this.fee = fee;
		this.fundsName = fundsName;
		this.topperName = topperName;
		this.javaTeacherName = javaTeacherName;
	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", noOfStudents=" + noOfStudents + ", hrName=" + hrName
				+ ", Chairmen=" + Chairmen + ", noOfStaffs=" + noOfStaffs + ", location=" + location + ", fee=" + fee
				+ ", fundsName=" + fundsName + ", topperName=" + topperName + ", javaTeacherName=" + javaTeacherName + "]";
	}
	
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Institution)
		{
			Institution institution = (Institution)obj;
			if(this.name.equals(institution.name)&&this.hrName.equals(institution.hrName)&&this.Chairmen.equals(institution.Chairmen)&&this.location.equals(institution.location)&&this.fundsName.equals(fundsName))
			{
				System.out.println("Here both propertis are matching each others");
				return true;
			}
			
			else
			{
				System.out.println("both properties are not matching");
			}
		}
		return false;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String gethrName() {
		return hrName;
	}

	public void sethrName(String hrName) {
		this.hrName = hrName;
	}

	public String getChairmen() {
		return Chairmen;
	}

	public void setChairmen(String chairmen) {
		Chairmen = chairmen;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getFundsName() {
		return fundsName;
	}

	public void setFundsName(String fundsName) {
		this.fundsName = fundsName;
	}

	public String getTopperName() {
		return topperName;
	}

	public void setTopperName(String topperName) {
		this.topperName = topperName;
	}

	public String getjavaTeacherName() {
		return javaTeacherName;
	}

	public void setptTeacherName(String javaTeacherName) {
		this.javaTeacherName = javaTeacherName;
	}
}
