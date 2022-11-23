package com.xworkz.equals;

public class Vehicle {

	private String brand;
	private String type;
	private String name;
	private int noOfWheels;
	private String color;
	private double mileage;
	private String material;
	private boolean isAlloy;
	private int seatCapacity;
	private int topSpeed;

	public Vehicle() {
		System.out.println("Default const of vehicle");
	}

	public Vehicle(String brand, String type, String name, int noOfWheels, String color, double mileage,
			String material, boolean isAlloy, int seatCapacity, int topSpeed) {
		super();
		this.brand = brand;
		this.type = type;
		this.name = name;
		this.noOfWheels = noOfWheels;
		this.color = color;
		this.mileage = mileage;
		this.material = material;
		this.isAlloy = isAlloy;
		this.seatCapacity = seatCapacity;
		this.topSpeed = topSpeed;
	}

	@Override
	public boolean equals(Object other) {
		System.out.println("running equals mathod in vehicle");
		if (other instanceof Vehicle) {
			System.out.println("other is vehicle");
			Vehicle casted = (Vehicle) other;
			if(this.color.equals(casted.color)) {
				System.out.println("color is same");
				return true;
			}
			if (this.brand.equals(casted.brand)) {
				System.out.println("brand is same");
				return true;
			}
		} else {
			System.err.println("other is not Vehicle");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", type=" + type + ", name=" + name + ", noOfWheels=" + noOfWheels
				+ ", color=" + color + ", mileage=" + mileage + ", material=" + material + ", isAlloy=" + isAlloy
				+ ", seatCapacity=" + seatCapacity + ", topSpeed=" + topSpeed + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isAlloy() {
		return isAlloy;
	}

	public void setAlloy(boolean isAlloy) {
		this.isAlloy = isAlloy;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

}
