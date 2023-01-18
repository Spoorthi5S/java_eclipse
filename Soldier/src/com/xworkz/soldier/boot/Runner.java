package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTo;
import com.xworkz.soldier.repository.SoldierRepo;
import com.xworkz.soldier.repository.SoldierRepoImpl;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		SoldierDTo dto = new SoldierDTo("Shashank", 1 ,"Topper", "Xworkz", "GayathriNagar");
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);

	}

}
