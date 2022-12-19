package com.xwrokz.Bakery.service;

import com.xwrokz.Bakery.dto.BakeryDTO;
import com.xwrokz.Bakery.exception.InvalidBakeryDataException;

public interface BakeryService {
	
	boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException;

}
