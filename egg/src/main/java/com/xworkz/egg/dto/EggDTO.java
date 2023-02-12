package com.xworkz.egg.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="egg_table")
public class EggDTO{
	
	
	@Id
	@Column(name ="id")
	private int id;
	@Column(name ="hotelName")
	private String hotelName;
	@Column(name = "dishName")
	private String dishName;
	@Column(name="type")
	private String type;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private int quantity;
	@Column(name="takeAway")
	private boolean takeAway;

	
}
