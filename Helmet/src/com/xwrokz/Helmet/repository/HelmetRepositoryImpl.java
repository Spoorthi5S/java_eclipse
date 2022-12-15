package com.xwrokz.Helmet.repository;

import com.xwrokz.Helmet.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {
	
	private HelmetDTO[] dtos=new HelmetDTO[5];
	private int currentIndex=0;

	@Override
	public boolean save(HelmetDTO dto) {
		System.out.println("running save in repo ");
		
		if(this.currentIndex>=this.dtos.length)
		{
			System.err.println("storage is full");
			return false;
		}
		this.dtos[this.currentIndex]=dto;
		System.out.println("data saved "+dto +"in index "+this.currentIndex);
		this.currentIndex++;
		
		return true;
	}

}
