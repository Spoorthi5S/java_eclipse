package com.xwrokz.Building.service;

import com.xwrokz.Bakery.dto.BakeryDTO;
import com.xwrokz.Bakery.exception.InvalidBakeryDataException;
import com.xwrokz.Bakery.repository.BakeryRepository;
import com.xwrokz.Building.dto.BuildingDTO;
import com.xwrokz.Building.exception.InvalidBuildingDataException;
import com.xwrokz.Building.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {
	
private BuildingRepository repository;
	
	public BuildingServiceImpl(BuildingRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateAndSave(BuildingDTO dto) throws InvalidBuildingDataException {
		
		System.out.println("running validateAndSave "+dto);
		String name=dto.getName();
		boolean validName=false;
		if(name!=null && name.length()>3 && name.length()<20)
		{
			System.out.println("Name is valid");
		}else {
			System.err.println("name is invalid, u will get an exception..."+name);
		}
		
		if(validName) {
			System.out.println("data is valid can store");
			boolean saved = this.repository.home(dto);
			System.out.println("data is saved successfully"+saved);
			return saved;
		}
		
		
		throw new InvalidBuildingDataException("check the data u have passed, it seems invalid...");
	
	}

	
	

}
