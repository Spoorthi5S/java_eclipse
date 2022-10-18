package com.xworkz.copy.things;


public class FriendsGroup {
	public int members;
	public boolean loyal;
	public String[] name;
	public String[] favColor;
	public String[] heightType;
	public String[] gender;
	public String[] weight;
	public String[] homeTown;
	public int age;
	public boolean enjoy;
	public char section;
	
	public FriendsGroup(int members,boolean loyal,String[] name,String[] favColor,
			String[] heightType,String[] gender,String[] weight,String[] homeTown,int age,boolean enjoy,char section)
	{
		this.members=members;
		this.loyal=loyal;
		this.name=name;
		this.favColor=favColor;
		this.heightType=heightType;
		this.gender=gender;
		this.weight=weight;
		this.homeTown=homeTown;
		this.age=age;
		this.enjoy=enjoy;
		this.section=section;
		System.out.println("FriendsGroup has 11 arguments");
		
	}

	public void display()
	{
		System.out.println(this.members);
		System.out.println(this.loyal);
		for (int i = 0; i < name.length; i++) {
			String string = name[i];
			System.out.println(string);
			
		}
	 for (int i = 0; i < favColor.length; i++) {
		String string = favColor[i];
		System.out.println(string);
	}
	 for (int i = 0; i < heightType.length; i++) {
		String string = heightType[i];
		System.out.println(string);
	}
	 for (int i = 0; i < gender.length; i++) {
		String string = gender[i];
		System.out.println(string);
	}
	 for (int i = 0; i < weight.length; i++) {
		String string = weight[i];
		System.out.println(string);
	}
	 for (int i = 0; i < homeTown.length; i++) {
		String string = homeTown[i];
		System.out.println(string);
	}
	 System.out.println(this.age);
	 System.out.println(this.enjoy);
	 System.out.println(this.section);
	}
}
