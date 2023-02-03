package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class BeachDTO {
	private String name;
	private String location;
	private boolean clean;
	private boolean games;

	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", location=" + location + ", clean=" + clean + ", games=" + games
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}
