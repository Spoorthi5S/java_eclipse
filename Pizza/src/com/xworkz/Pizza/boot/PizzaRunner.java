package com.xworkz.Pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.Pizza.constant.PizzaSize;
import com.xworkz.Pizza.dto.PizzaDto;
import com.xworkz.Pizza.service.PizzaService;
import com.xworkz.Pizza.service.PizzaServiceImpl;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaDto pizzaDto=new PizzaDto();
		pizzaDto.setName("Cheese Brust");
		pizzaDto.setPrice(270);
		pizzaDto.setSize(PizzaSize.MEDIUM);
		pizzaDto.setToppings("onion");
		pizzaDto.setType("veg");
		pizzaDto.setCheese(true);
		pizzaDto.setCompany("Domino's");
		pizzaDto.setCreatedBy("SYSTEM");
		pizzaDto.setCreatedDate(LocalDateTime.now());
		
		PizzaService pizzaService = new PizzaServiceImpl();
		boolean saved = pizzaService.validateAndSave(pizzaDto);
		System.out.println(saved);
	}

}
