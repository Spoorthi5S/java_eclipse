package com.xworkz.Missile.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.Missile.dto.MissileDTO;
import com.xworkz.Missile.repository.MissileRepo;
import com.xworkz.Resort.dto.ResortDTO;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;
	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo = missileRepo;
		System.out.println("Created service by passing repo from spring");
	}
	
	
	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("running validate and save");
		System.out.println("dto "+ dto);
		
		Set<ConstraintViolation<MissileDTO>> violations = this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("there are validation errors");
			violations.forEach(cv -> System.err.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("Data is valid... + can save");
			boolean saved = this.missileRepo.save(dto);
			System.out.println("saved missile " + saved);
			return saved;
		}
		
	}

}
