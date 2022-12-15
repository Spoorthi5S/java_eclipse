package com.xwrokz.Helmet.dto;

import com.xwrokz.Helmet.constant.Color;
import com.xwrokz.Helmet.constant.HelmetType;

public class HelmetDTO {

	private String brand;
	private HelmetType type;
	private double price;
	private Color color;

	public HelmetDTO() {
		super();
	}

	public HelmetDTO(String brand, HelmetType type, double price, Color color) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
