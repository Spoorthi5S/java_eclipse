package com.xwrokz.Building.boot;

import com.xwrokz.Building.dto.BuildingDTO;
import com.xwrokz.Building.exception.InvalidBuildingDataException;
import com.xwrokz.Building.repository.BuildingRepository;
import com.xwrokz.Building.repository.BuildingRepositoryImpl;
import com.xwrokz.Building.service.BuildingService;
import com.xwrokz.Building.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {
		
		BuildingDTO dto = new BuildingDTO();
		BuildingRepository repository = new BuildingRepositoryImpl();
		BuildingService service = new BuildingServiceImpl(repository);
		
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("After calling validate and save");
			
		}catch(InvalidBuildingDataException e) {
			e.printStackTrace();
		}
		System.out.println("after catch bock...");

	}


	}


