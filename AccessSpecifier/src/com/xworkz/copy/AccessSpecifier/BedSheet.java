package com.xworkz.copy.AccessSpecifier;

public class BedSheet {

	public String Brand;
	public String color;
	boolean pink;
	boolean pillowCover;
	String type;
	char size;
	int quantity;
	float quality;
	String design;
	boolean printed;
	double price;

	public BedSheet(String brand, String color, boolean pink, boolean pillowCover, String type, char size, int quantity,
			float quality, String design, boolean printed, double price) {
		super();
		Brand = brand;
		this.color = color;
		this.pink = pink;
		this.pillowCover = pillowCover;
		this.type = type;
		this.size = size;
		this.quantity = quantity;
		this.quality = quality;
		this.design = design;
		this.printed = printed;
		this.price = price;
	}

	public String getBrand() {
		return Brand;
	}

	public String getColor() {
		return color;
	}

	public boolean isPink() {
		return pink;
	}

	public boolean isPillowCover() {
		return pillowCover;
	}

	public String getType() {
		return type;
	}

	public char getSize() {
		return size;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getQuality() {
		return quality;
	}

	public String getDesign() {
		return design;
	}

	public boolean isPrinted() {
		return printed;
	}

	public double getPrice() {
		return price;
	}

	
}
