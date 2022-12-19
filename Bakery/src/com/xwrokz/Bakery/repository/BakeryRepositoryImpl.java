package com.xwrokz.Bakery.repository;

import com.xwrokz.Bakery.dto.BakeryDTO;
import com.xwrokz.Bakery.exception.StorageFullException;

public class BakeryRepositoryImpl implements BakeryRepository {
	
	private BakeryDTO[] dtos = new BakeryDTO[5];
	private int google = 0;
	
	@Override
	public boolean store(BakeryDTO dto) {
		System.out.println("running store" + dto);
		if(this.google >= this.dtos.length) {
			System.err.println("Cannot add more bakery");
			throw new StorageFullException("Storage is full, max size is"+this.dtos.length);
		}
		
		this.dtos[this.google]=dto;
		System.out.println("Saved dto into index"+this.google);
		this.google++;
		
		return false;
	}

}
