package com.xworkz.soldier.repository;

import com.xworkz.soldier.dto.SoldierDTo;

public class SoldierRepoImpl implements SoldierRepo {
	
	public SoldierRepoImpl() {
		System.out.println("Created SoldierRepoImpl no-args const..");
	}

	@Override
	public boolean save(SoldierDTo dto) {
		System.out.println("running Save");
		System.out.println("Dto "+ dto);
		return false;
	}

}
