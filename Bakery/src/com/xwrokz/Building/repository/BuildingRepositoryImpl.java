package com.xwrokz.Building.repository;

import com.xwrokz.Bakery.dto.BakeryDTO;
import com.xwrokz.Building.dto.BuildingDTO;
import com.xwrokz.Building.exception.StorageFullException;
import com.xwrokz.Building.dto.BuildingDTO;

public class BuildingRepositoryImpl implements BuildingRepository {

	private BuildingDTO[] dtos = new BuildingDTO[5];
	private int google = 0;
	
	@Override
	public boolean home(BuildingDTO dto) {
		System.out.println("running home" + dto);
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
