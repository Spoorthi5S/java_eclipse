package com.xworkz.FirstAid.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.FirstAid.dto.FirstAidDTO;
import com.xworkz.FirstAid.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
		System.out.println("Created Service by passing repo.. from spring...");
	}

	@Override
	public boolean validateAndSave(FirstAidDTO aidDto) {
		System.out.println("running validate and save");
		System.out.println("aidDto "+ aidDto);
		
		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(aidDto);
		
		if(!violations.isEmpty()) {
			System.err.println("there are validation errors");
			violations.forEach(cv -> System.err.println(cv.getMessage()));
			return false;
		}else {
			System.out.println("Data is valid... + can save");
			boolean saved = this.firstAidRepo.save(aidDto);
			System.out.println("Saved first aid " + saved);
			return saved;
		}
		
	}

}
