package com.xworkz.Resort.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.FirstAid.dto.FirstAidDTO;
import com.xworkz.FirstAid.repository.FirstAidRepo;
import com.xworkz.Resort.dto.ResortDTO;
import com.xworkz.Resort.repository.ResortRepo;
@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
		System.out.println("Created Service by passing repo.. from spring...");
	}

	@Override
	public boolean validateAndSave(ResortDTO resortDto) {
		System.out.println("running validate and save");
		System.out.println("resortDto "+ resortDto);
		
		Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(resortDto);
		
		if(!violations.isEmpty()) {
			System.err.println("there are validation errors");
			violations.forEach(cv -> System.err.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("Data is valid... + can save");
			boolean saved = this.resortRepo.save(resortDto);
			System.out.println("Saved resort " + saved);
			return saved;
		}
		
	}

}
