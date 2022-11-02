package com.xworkz.copy.AccessSpecifier;

public class Pullover {
	private String brand="blackberry";
	private String type="polo neck";
	private String brandOwner="mohan";
	private String manufactureCountry="india";
	private double price=12000;
	private String manufactureDate="2016-10-22";
	private String founder="nikhkil & mohan";
	private boolean comfy=true;
	private int quantity=2;
	private char size ='S';
	private String colour="grey";
	
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	void setType(String type) {
		this.type = type;
	}
	void setBrandOwner(String brandOwner) {
		this.brandOwner = brandOwner;
	}
	void setManufactureCountry(String manufactureCountry) {
		this.manufactureCountry = manufactureCountry;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	void setFounder(String founder) {
		this.founder = founder;
	}
	void setComfy(boolean comfy) {
		this.comfy = comfy;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	void setSize(char size) {
		this.size = size;
	}
	void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
	public String getBrandOwner() {
		return brandOwner;
	}
	public String getManufactureCountry() {
		return manufactureCountry;
	}
	public double getPrice() {
		return price;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public String getFounder() {
		return founder;
	}
	public boolean isComfy() {
		return comfy;
	}
	public int getQuantity() {
		return quantity;
	}
	public char getSize() {
		return size;
	}
	public String getColour() {
		return colour;
	}
	

}
