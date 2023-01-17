package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terrorist.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService {
	public TerroristServiceImpl() {
		System.out.println("Created TerroristServiceImpl using no-args const");
	}

	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("executing validateAndSave start");
		System.out.println("Dto passed :" + dto);
		
		ValidatorFactory factor = Validation.buildDefaultValidatorFactory();
		Validator validator = factor.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(c -> System.err.println(c.getMessage()));
			return false;
		}
		System.out.println("No validation errors");
		return true;
	}

}
