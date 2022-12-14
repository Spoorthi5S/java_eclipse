package com.xworkz.Pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.Pizza.constant.PizzaSize;

public class PizzaDto extends AbstractAuditDto {

	private String name;
	private String company;
	private PizzaSize size;
	private boolean cheese;
	private double price;
	private String type;
	private String toppings;

	public PizzaDto() {
		
	}

	public PizzaDto(String name, String company, PizzaSize size, boolean cheese, double price, String type,
			String toppings,String createdBy,LocalDateTime createdDate,String updatedBy,LocalDateTime updatedDate) {
		super(createdBy,createdDate,updatedBy,updatedDate);
		this.name = name;
		this.company = company;
		this.size = size;
		this.cheese = cheese;
		this.price = price;
		this.type = type;
		this.toppings = toppings;
	}

	@Override
	public String toString() {
		return "PizzaDto [name=" + name + ", company=" + company + ", size=" + size + ", cheese=" + cheese + ", price="
				+ price + ", type=" + type + ", toppings=" + toppings + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

}
