package com.xworkz.equals;

public class Paint {
	private String place;
	private String brand;
	private int price;
	private boolean guarantee;
	private String color;
	private boolean pigments;
	private int polymersPresent;
	private boolean highOpacity;
	private boolean art;
	private int type;

	public Paint() {
		System.out.println("Default const of Paint");
	}

	public Paint(String place, String brand, int price, boolean guarantee, String color, boolean pigments,
			int polymersPresent, boolean highOpacity, boolean art, int type) {
		super();
		this.place = place;
		this.brand = brand;
		this.price = price;
		this.guarantee = guarantee;
		this.color = color;
		this.pigments = pigments;
		this.polymersPresent = polymersPresent;
		this.highOpacity = highOpacity;
		this.art = art;
		this.type = type;
	}
	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in paint");
		if(other instanceof Paint)
		{
			System.out.println("other is paint");
			Paint casted=(Paint)other;
			if(this.brand.equals(casted.brand)) {
				System.out.println("brand is same");
				return true;
			}
		}
		else {
			System.err.println("other is not paint");
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Paint [place=" + place + ", brand=" + brand + ", price=" + price + ", guarantee=" + guarantee
				+ ", color=" + color + ", pigments=" + pigments + ", polymersPresent=" + polymersPresent
				+ ", highOpacity=" + highOpacity + ", art=" + art + ", type=" + type + "]";
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isGuarantee() {
		return guarantee;
	}

	public void setGuarantee(boolean guarantee) {
		this.guarantee = guarantee;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPigments() {
		return pigments;
	}

	public void setPigments(boolean pigments) {
		this.pigments = pigments;
	}

	public int getPolymersPresent() {
		return polymersPresent;
	}

	public void setPolymersPresent(int polymersPresent) {
		this.polymersPresent = polymersPresent;
	}

	public boolean isHighOpacity() {
		return highOpacity;
	}

	public void setHighOpacity(boolean highOpacity) {
		this.highOpacity = highOpacity;
	}

	public boolean isArt() {
		return art;
	}

	public void setArt(boolean art) {
		this.art = art;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	

}
