package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.service.TerroristService;
import com.xworkz.terrorist.service.TerroristServiceImpl;

public class Runner {

	public static void main(String[] args) {
		TerroristDTO dto = new TerroristDTO();
		dto.setName("Krishna");
		dto.setAge(19);
		dto.setAlive(true);
		dto.setCountry("India");
		dto.setOrganization("priyankaOrganization");
		dto.setPrison(false);
		dto.setSpecialization("shooting");
		System.out.println(dto);
		
		TerroristService service = new TerroristServiceImpl();
		service.validateAndSave(dto);
	}

}
