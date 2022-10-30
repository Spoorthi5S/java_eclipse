package com.xworkz.OneToMany;

public class Name {
	
	public String currentName;
	public String oldName;
	public String futureName;

	public Name(String currentName, String oldName, String futureName) {
		super();
		this.currentName=currentName;
		this.oldName=oldName;
		this.futureName=futureName;
	}

	public void display() {
		System.out.println("Displaying Name");
		System.out.println(this.currentName);
		System.out.println(this.oldName);
		System.out.println(this.futureName);
		
	}

}
