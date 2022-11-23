package com.xworkz.equals;

public class God {

	private String name;
	private String gender;
	private int marriage;
	private boolean notMarriage;
	private String place;
	private String wifeName;
	private long kilometers;
	private boolean children;
	private String childName;
	private String weapon;

	public God() {
		System.out.println("Default const of god");
	}

	public God(String name, String gender, int marriage, boolean notMarriage, String place, String wifeName,
			long kilometers, boolean children, String childName, String weapon) {
		super();
		this.name = name;
		this.gender = gender;
		this.marriage = marriage;
		this.notMarriage = notMarriage;
		this.place = place;
		this.wifeName = wifeName;
		this.kilometers = kilometers;
		this.children = children;
		this.childName = childName;
		this.weapon = weapon;
	}
	@Override
	public boolean equals(Object other) {
		System.out.println("running equals mathod in god");
		if (other instanceof God) {
			System.out.println("other is God");
			God god = (God) other;
			if(this.name.equals(god.name) && this.wifeName.equals(god.wifeName) && this.gender.equals(god.gender) && this.place.equals(god.place) && this.childName.equals(god.childName))  {
				System.out.println("are same");
				return true;
			}
		}
		else {
			System.out.println("other is not god");
		
		return false;
		}
		return children;
	
	}
	@Override
	public String toString() {
		return "God [name=" + name + ", gender=" + gender + ", marriage=" + marriage + ", notMarriage=" + notMarriage
				+ ", place=" + place + ", wifeName=" + wifeName + ", kilometers=" + kilometers + ", children="
				+ children + ", childName=" + childName + ", weapon=" + weapon + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMarriage() {
		return marriage;
	}

	public void setMarriage(int marriage) {
		this.marriage = marriage;
	}

	public boolean isNotMarriage() {
		return notMarriage;
	}

	public void setNotMarriage(boolean notMarriage) {
		this.notMarriage = notMarriage;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public long getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public boolean isChildren() {
		return children;
	}

	public void setChildren(boolean children) {
		this.children = children;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	
}
