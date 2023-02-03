package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CassinoDTO;

@Component
@RequestMapping("/casino")
public class CassinoController {
	public CassinoController() {
		System.out.println("created "+this.getClass().getSimpleName());
		
	}
	@PostMapping
	public String onCassino(CassinoDTO dto, Model model) {
		System.out.println("running onCassino"+dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("price", dto.getEntryFee());
		return "index.jsp";
	}

}
