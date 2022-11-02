package com.xworkz.copy.AccessSpecifier;

public class PG {

	public String name;
	public boolean vacancy;
	public int members;
	public String area;
	public int roomNumbers;
	public String PGType;
	public String color;
	boolean bigRooms;
	int sharing;
	boolean cuboured;
	boolean light24hrs;

	public PG(String name, boolean vacancy, int members, String area, int roomNumbers, String pGType, String color,
			boolean bigRooms, int sharing, boolean cuboured, boolean light24hrs) {
		super();
		this.name = name;
		this.vacancy = vacancy;
		this.members = members;
		this.area = area;
		this.roomNumbers = roomNumbers;
		PGType = pGType;
		this.color = color;
		this.bigRooms = bigRooms;
		this.sharing = sharing;
		this.cuboured = cuboured;
		this.light24hrs = light24hrs;
	}

	public String getName() {
		return name;
	}

	public boolean isVacancy() {
		return vacancy;
	}

	public int getMembers() {
		return members;
	}

	public String getArea() {
		return area;
	}

	public int getRoomNumbers() {
		return roomNumbers;
	}

	public String getPGType() {
		return PGType;
	}

	public String getColor() {
		return color;
	}

	public boolean isBigRooms() {
		return bigRooms;
	}

	public int getSharing() {
		return sharing;
	}

	public boolean isCuboured() {
		return cuboured;
	}

	public boolean isLight24hrs() {
		return light24hrs;
	}

	

}
