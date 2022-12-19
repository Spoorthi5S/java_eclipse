package com.xwrokz.RailwayStation.boot;

import com.xwrokz.RailwayStation.dto.RailwayStationDTO;
import com.xwrokz.RailwayStation.exception.InvalidRailwayStationDataException;
import com.xwrokz.RailwayStation.repository.RailwayStationRepository;
import com.xwrokz.RailwayStation.repository.RailwayStationRepositoryImpl;
import com.xwrokz.RailwayStation.service.RailwayStationService;
import com.xwrokz.RailwayStation.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {
		RailwayStationDTO dto = new RailwayStationDTO();
		RailwayStationRepository repository = new RailwayStationRepositoryImpl();
		RailwayStationService service = new RailwayStationServiceImpl(repository);
		
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("After calling validate and save");
			
		}catch(InvalidRailwayStationDataException e) {
			e.printStackTrace();
		}
		System.out.println("after catch bock...");

	}

	

}
