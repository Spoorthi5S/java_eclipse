package com.xworkz.OneToMany;

public class President {
	public String name;
	public int tenure=5;
	public Gender gender;
	
	public President(String name) {
		super();
		this.name=name;
	}
	public void setGender(Gender gender) {
		this.gender=gender;
	}
	

	public void showOff() {
		System.out.println("Showing values");
		System.out.println(this.name);
		System.out.println(this.tenure);
		System.out.println(this.gender);
		
		
	}

}
