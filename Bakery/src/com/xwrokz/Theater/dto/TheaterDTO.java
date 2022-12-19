package com.xwrokz.Theater.dto;

import com.xwrokz.Bakery.dto.AbstractAuditDTO;

public class TheaterDTO extends AbstractAuditDTO {

	private String id;
	private String name;
	private String brand;
	private int seats;

	public TheaterDTO() {
		super();
	}

	public TheaterDTO(String id, String name, String brand, int seats) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheaterDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", seats=" + seats + ", toString()="
				+ super.toString() + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
