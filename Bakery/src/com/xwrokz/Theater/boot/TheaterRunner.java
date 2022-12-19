package com.xwrokz.Theater.boot;

import com.xwrokz.Theater.dto.TheaterDTO;
import com.xwrokz.Theater.exception.InvalidTheaterDataException;
import com.xwrokz.Theater.repository.TheaterRepository;
import com.xwrokz.Theater.repository.TheaterRepositoryImpl;
import com.xwrokz.Theater.service.TheaterService;
import com.xwrokz.Theater.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {
		TheaterDTO dto = new TheaterDTO();
		TheaterRepository repository = new TheaterRepositoryImpl();
		TheaterService service = new TheaterServiceImpl(repository);
		
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("After calling validate and save");
			
		}catch(InvalidTheaterDataException e) {
			e.printStackTrace();
		}
		System.out.println("after catch bock...");

	}

	

}
