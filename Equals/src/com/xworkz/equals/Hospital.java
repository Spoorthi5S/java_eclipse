package com.xworkz.equals;

public class Hospital {
	private String name;
	private int noOfDoctor;
	private String childrensDoctor;
	private String Chairmen;
	private int noOfStaffs;
	private String location;
	private double fee;
	private String fundsName;
	private String mentalDoctorName;
	private String generalDoctorName;

	public Hospital(String name, int noOfDoctor, String childrensDoctor, String chairmen, int noOfStaffs,
			String location, double fee, String fundsName, String mentalDoctorName, String generalDoctorName) {
		super();
		this.name = name;
		this.noOfDoctor = noOfDoctor;
		this.childrensDoctor = childrensDoctor;
		Chairmen = chairmen;
		this.noOfStaffs = noOfStaffs;
		this.location = location;
		this.fee = fee;
		this.fundsName = fundsName;
		this.mentalDoctorName = mentalDoctorName;
		this.generalDoctorName = generalDoctorName;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", noOfDoctor=" + noOfDoctor + ", childrensDoctor=" + childrensDoctor
				+ ", Chairmen=" + Chairmen + ", noOfStaffs=" + noOfStaffs + ", location=" + location + ", fee=" + fee
				+ ", fundsName=" + fundsName + ", mentalDoctorName=" + mentalDoctorName + ", generalDoctorName="
				+ generalDoctorName + "]";
	}

	public boolean equals(Object obj) {
		if (obj instanceof Hospital) {
			Hospital hospital = (Hospital) obj;
			if (this.name.equals(hospital.name) && this.childrensDoctor.equals(hospital.childrensDoctor)
					&& this.Chairmen.equals(hospital.Chairmen) && this.location.equals(hospital.location)
					&& this.fundsName.equals(hospital.fundsName)
					&& this.generalDoctorName.equals(hospital.generalDoctorName)) {
				System.out.println("Here both propertis are matching each others");
				return true;
			}

			else {
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

	public int getNoOfDoctor() {
		return noOfDoctor;
	}

	public void setNoOfDoctor(int noOfDoctor) {
		this.noOfDoctor = noOfDoctor;
	}

	public String getChildrensDoctor() {
		return childrensDoctor;
	}

	public void setChildrensDoctor(String childrensDoctor) {
		this.childrensDoctor = childrensDoctor;
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

	public String getMentalDoctorName() {
		return mentalDoctorName;
	}

	public void setMentalDoctorName(String mentalDoctorName) {
		this.mentalDoctorName = mentalDoctorName;
	}

	public String getGenralDoctorName() {
		return generalDoctorName;
	}

	public void setGenralDoctorName(String genralDoctorName) {
		this.generalDoctorName = genralDoctorName;
	}

}
