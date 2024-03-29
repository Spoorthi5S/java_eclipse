package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.service.EggService;

@Controller
@RequestMapping("/egg")
public class EggController {

	@Autowired
	private EggService eggService;

	public EggController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onEgg(EggDTO eggDto, Model model) {
		System.out.println("running OnEgg " + eggDto);
		
		model.addAttribute("hotelName", eggDto.getHotelName());
		model.addAttribute("dishName", eggDto.getDishName());
		model.addAttribute("type", eggDto.getType());
		model.addAttribute("price", eggDto.getPrice());
		model.addAttribute("quantity", eggDto.getQuantity());
		model.addAttribute("takeAway", eggDto.isTakeAway());
		boolean saved = this.eggService.validateAndSave(eggDto);
		System.out.println("saved" + saved);
		return "index";
	}
}
