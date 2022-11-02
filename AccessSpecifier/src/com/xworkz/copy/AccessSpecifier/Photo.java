package com.xworkz.copy.AccessSpecifier;

public class Photo {

    
	private String material="wooden";
	private char size='L';
	private boolean Quality=true;
	private int quantity=10;
	private int price=350;
	private String colour="nickel";
	private String mountingType="wall mount";
	private String shape="circle";
	private double weight=562;
	private String brand="presto";
	private boolean damage=false;
	
	void setMaterial(String material) {
		this.material = material;
	}
	void setSize(char size) {
		this.size = size;
	}
	void setQuality(boolean quality) {
		Quality = quality;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void setColour(String colour) {
		this.colour = colour;
	}
	void setMountingType(String mountingType) {
		this.mountingType = mountingType;
	}
	void setShape(String shape) {
		this.shape = shape;
	}
	void setWeight(double weight) {
		this.weight = weight;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	void setDamage(boolean damage) {
		this.damage = damage;
	}
	public String getMaterial() {
		return material;
	}
	public char getSize() {
		return size;
	}
	public boolean isQuality() {
		return Quality;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	public String getColour() {
		return colour;
	}
	public String getMountingType() {
		return mountingType;
	}
	public String getShape() {
		return shape;
	}
	public double getWeight() {
		return weight;
	}
	public String getBrand() {
		return brand;
	}
	public boolean isDamage() {
		return damage;
	}
	
	

}
