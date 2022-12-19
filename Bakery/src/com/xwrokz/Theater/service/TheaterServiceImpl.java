package com.xwrokz.Theater.service;

import com.xwrokz.Theater.dto.TheaterDTO;
import com.xwrokz.Theater.exception.InvalidTheaterDataException;
import com.xwrokz.Theater.repository.TheaterRepository;
import com.xwrokz.Theater.dto.TheaterDTO;
import com.xwrokz.Theater.exception.InvalidTheaterDataException;

public class TheaterServiceImpl implements TheaterService {

private TheaterRepository repository;
	
	public TheaterServiceImpl(TheaterRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException {
		
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
		
		
		throw new InvalidTheaterDataException("check the data u have passed, it seems invalid...");
	
	}
}
