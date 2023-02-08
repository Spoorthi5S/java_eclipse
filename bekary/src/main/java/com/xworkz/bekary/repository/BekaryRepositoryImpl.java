package com.xworkz.bekary.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bekary.dto.BekaryDTO;

@Repository
public class BekaryRepositoryImpl implements BekaryRepository {
	public BekaryRepositoryImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BekaryDTO bekaryDto) {
		System.out.println("running save in bekaryRepository..");
		return false;
	}

}
