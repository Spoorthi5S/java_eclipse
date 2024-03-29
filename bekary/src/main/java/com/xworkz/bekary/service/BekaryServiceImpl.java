package com.xworkz.bekary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bekary.dto.BekaryDTO;
import com.xworkz.bekary.repository.BekaryRepository;

@Service
public class BekaryServiceImpl implements BekaryService {
	@Autowired
	private BekaryRepository bekaryRepository;
public BekaryServiceImpl() {
	System.out.println("created "+this.getClass().getSimpleName());
}
	@Override
	public boolean validateAndSave(BekaryDTO dto) {
		System.out.println("running validate and save in BekaryService.."+dto);
		boolean saved = this.bekaryRepository.save(dto);
		System.out.println("saved in repo "+ saved);
		return false;
	}

}
