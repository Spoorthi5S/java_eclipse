package com.xwrokz.Bakery.boot;

import com.xwrokz.Bakery.dto.BakeryDTO;
import com.xwrokz.Bakery.exception.InvalidBakeryDataException;
import com.xwrokz.Bakery.repository.BakeryRepository;
import com.xwrokz.Bakery.repository.BakeryRepositoryImpl;
import com.xwrokz.Bakery.service.BakeryService;
import com.xwrokz.Bakery.service.BakeryServiceImpl;

public class BekaryRunner {

	public static void main(String[] args) {
		BakeryDTO dto = new BakeryDTO("Spoorthi","spoorthi","rajajinagar", "peda", 178);
		BakeryRepository repository = new BakeryRepositoryImpl();
		BakeryService service = new BakeryServiceImpl(repository);
		
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("After calling validate and save");
			
		}catch(InvalidBakeryDataException e) {
			e.printStackTrace();
		}
		System.out.println("after catch bock...");

	}

}
