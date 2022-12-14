package com.xworkz.Pizza.service;

import com.xworkz.Pizza.constant.PizzaSize;
import com.xworkz.Pizza.dto.PizzaDto;

public class PizzaServiceImpl implements PizzaService{

	@Override
	public boolean validateAndSave(PizzaDto dto) {
		System.out.println("Running validateAndSave "+dto);
		String name=dto.getName();
		double price=dto.getPrice();
		PizzaSize size=dto.getSize();
		String topping=dto.getToppings();
		String type=dto.getType();
		boolean validName = false;
		boolean validPrice = false;
		boolean validSize= false;
		boolean validTopping = false;
		boolean validType=false;
		if(name!=null && name.length()>=4 && name.length()<=20)
		{
			System.out.println("valid pizza name "+name);
			validName = true;
		}
		else {
			System.out.println("Invalid pizza name "+name);
		}
		if(price >=50 && price <= 12000) {
			System.out.println("valid price "+price);
			validPrice = true;
		}else {
			System.out.println("Invalid price "+ price);
		}
		if(size!=null) {
			System.out.println("valid size "+ size);
			validSize = true;
		}else {
			System.out.println("invalid size "+size);
		}
		if(topping!=null && topping.length()>=3 && topping.length()<=20)
		{
			System.out.println("valid topping "+topping);
			validTopping = true;
		}else {
			System.out.println("invalid topping "+topping);
		}
		if(type!=null && type=="VEG"|| type=="NON VEG") {
			System.out.println("valid type "+type);
			validType = true;
		}else {
			System.out.println("invalid type "+type);
		}
		
		if(validName && validPrice && validSize && validTopping && validType) {
			System.out.println("Pizza DTO is valid "+ dto);
			return true;
		}
		System.out.println("Pizza is not valid "+ dto);
		return false;
	}
	
	

}
