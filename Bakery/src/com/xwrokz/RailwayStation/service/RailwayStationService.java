package com.xwrokz.RailwayStation.service;

import com.xwrokz.RailwayStation.dto.RailwayStationDTO;
import com.xwrokz.RailwayStation.exception.InvalidRailwayStationDataException;

public interface RailwayStationService {
	
	boolean validateAndSave(RailwayStationDTO dto) throws InvalidRailwayStationDataException;

}
