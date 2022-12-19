package com.xwrokz.Place.boot;

import com.xwrokz.Place.dto.PlaceDTO;
import com.xwrokz.Place.exception.InvalidPlaceDataException;
import com.xwrokz.Place.repository.PlaceRepository;
import com.xwrokz.Place.repository.PlaceRepositoryImpl;
import com.xwrokz.Place.service.PlaceService;
import com.xwrokz.Place.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO dto = new PlaceDTO("Shimoga","Karnataka",577201L,true,"Jog-falls");
		PlaceDTO dto1 = new PlaceDTO("Thirtalli","Karnataka",577203L,true,"gajnur-dam");
		PlaceRepository repository = new PlaceRepositoryImpl();
		PlaceService service = new PlaceServiceImpl(repository);
		
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			service.validateAndSave(dto1);
			System.out.println("After calling validate and save");
			
		}catch(InvalidPlaceDataException e) {
			e.printStackTrace();
		}
		System.out.println("after catch bock...");

	}
}

	


