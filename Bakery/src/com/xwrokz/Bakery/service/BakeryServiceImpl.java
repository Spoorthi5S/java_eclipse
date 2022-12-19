package com.xwrokz.Bakery.service;

import com.xwrokz.Bakery.dto.BakeryDTO;
import com.xwrokz.Bakery.exception.InvalidBakeryDataException;
import com.xwrokz.Bakery.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {
	
	private BakeryRepository repository;
	
	public BakeryServiceImpl(BakeryRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException {
		
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
		
		
		throw new InvalidBakeryDataException("check the data u have passed, it seems invalid...");
	
	}
		
}




