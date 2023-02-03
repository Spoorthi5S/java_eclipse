package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;
import com.xworkz.goa.dto.CassinoDTO;

@Component
@RequestMapping("/beach")
public class BeachController {
	public BeachController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onBeach(BeachDTO beachDto, Model model) {
		System.out.println("running onBeach"+beachDto);
		model.addAttribute("name", beachDto.getName());
		model.addAttribute("location", beachDto.getLocation());
		
		return "index.jsp";
	}
}
