package com.xwrokz.Building.service;

import com.xwrokz.Building.dto.BuildingDTO;
import com.xwrokz.Building.exception.InvalidBuildingDataException;

public interface BuildingService {
	
	boolean validateAndSave(BuildingDTO dto) throws InvalidBuildingDataException;

}
