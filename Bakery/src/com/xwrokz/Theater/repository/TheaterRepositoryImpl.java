package com.xwrokz.Theater.repository;

import com.xwrokz.Theater.dto.TheaterDTO;
import com.xwrokz.Theater.exception.StorageFullException;
import com.xwrokz.Theater.dto.TheaterDTO;

public class TheaterRepositoryImpl implements TheaterRepository {

	private TheaterDTO[] dtos = new TheaterDTO[5];
	private int google = 0;
	
	@Override
	public boolean store(TheaterDTO dto) {
		System.out.println("running store" + dto);
		if(this.google >= this.dtos.length) {
			System.err.println("Cannot add more Theater");
			throw new StorageFullException("Storage is full, max size is"+this.dtos.length);
		}
		
		this.dtos[this.google]=dto;
		System.out.println("Saved dto into index"+this.google);
		this.google++;
		
		return false;
	}

}
