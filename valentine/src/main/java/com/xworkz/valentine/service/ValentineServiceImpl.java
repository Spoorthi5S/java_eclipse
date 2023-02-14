package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;

@Service
public class ValentineServiceImpl implements ValentineService {
	public ValentineServiceImpl() {
		System.out.println("craeted " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("running validate and save");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> constraintViolations = validator.validate(dto);
		if (constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("Violations in dto" + dto);
			return constraintViolations;
		} else {
			System.out.println("constaintViolations does not exist in dto, can save");
			return Collections.emptySet();
		}

	}

}
