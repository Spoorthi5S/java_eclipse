package com.xwrokz.RailwayStation.repository;

import com.xwrokz.RailwayStation.dto.RailwayStationDTO;
import com.xwrokz.RailwayStation.exception.StorageFullException;
import com.xwrokz.RailwayStation.dto.RailwayStationDTO;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {

	private RailwayStationDTO[] dtos = new RailwayStationDTO[5];
	private int google = 0;
	
	@Override
	public boolean store(RailwayStationDTO dto) {
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
