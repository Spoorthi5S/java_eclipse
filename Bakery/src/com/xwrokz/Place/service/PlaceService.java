package com.xwrokz.Place.service;

import com.xwrokz.Place.dto.PlaceDTO;
import com.xwrokz.Place.exception.InvalidPlaceDataException;

public interface PlaceService {
	
	boolean validateAndSave(PlaceDTO dto) throws InvalidPlaceDataException;

}
