package com.xwrokz.Theater.service;

import com.xwrokz.Theater.dto.TheaterDTO;
import com.xwrokz.Theater.exception.InvalidTheaterDataException;

public interface TheaterService {
	
	boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException;

}
