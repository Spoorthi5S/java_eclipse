package com.xwrokz.RailwayStation.service;

import com.xwrokz.RailwayStation.dto.RailwayStationDTO;
import com.xwrokz.RailwayStation.exception.InvalidRailwayStationDataException;
import com.xwrokz.RailwayStation.repository.RailwayStationRepository;
import com.xwrokz.RailwayStation.dto.RailwayStationDTO;
import com.xwrokz.RailwayStation.exception.InvalidRailwayStationDataException;

public class RailwayStationServiceImpl implements RailwayStationService {

private RailwayStationRepository repository;
	
	public RailwayStationServiceImpl(RailwayStationRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws InvalidRailwayStationDataException {
		
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
		
		
		throw new InvalidRailwayStationDataException("check the data u have passed, it seems invalid...");
	
	}

}
