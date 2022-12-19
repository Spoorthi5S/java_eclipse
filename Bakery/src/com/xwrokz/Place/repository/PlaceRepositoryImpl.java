package com.xwrokz.Place.repository;

import com.xwrokz.Place.dto.PlaceDTO;
import com.xwrokz.Place.exception.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository {

	private PlaceDTO[] dtos = new PlaceDTO[5];
	private int google = 0;
	
	@Override
	public boolean store(PlaceDTO dto) {
		System.out.println("running store" + dto);
		if(this.google >= this.dtos.length) {
			System.err.println("Cannot add more Place");
			throw new StorageFullException("Storage is full, max size is"+this.dtos.length);
		}
		
		this.dtos[this.google]=dto;
		System.out.println("Saved dto into index"+this.google);
		this.google++;
		
		return false;
	}
}
