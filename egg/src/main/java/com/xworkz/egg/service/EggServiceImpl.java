package com.xworkz.egg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.repository.EggRepository;

@Component
public class EggServiceImpl implements EggService {
	@Autowired
	private EggRepository eggRepository;

	public EggServiceImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("running validate and save in EggService");
		boolean saved = this.eggRepository.save(dto);
		System.out.println("saved in service " + saved);
		return false;
	}

}
