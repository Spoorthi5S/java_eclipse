package com.xwrokz.Place.service;

import com.xwrokz.Place.dto.PlaceDTO;
import com.xwrokz.Place.exception.InvalidPlaceDataException;
import com.xwrokz.Place.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService {

private PlaceRepository repository;
	
	public PlaceServiceImpl(PlaceRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidPlaceDataException {
		
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
			boolean saved = this.repository.store(dto);
			System.out.println("data is saved successfully"+saved);
			return saved;
		}
		
		
		throw new InvalidPlaceDataException("check the data u have passed, it seems invalid...");
	
	}

}
