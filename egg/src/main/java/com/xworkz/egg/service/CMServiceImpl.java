package com.xworkz.egg.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.CmDTO;
@Service
public class CMServiceImpl implements CMService {
public CMServiceImpl() {
	System.out.println("created "+this.getClass().getSimpleName());
}
	@Override
	public Set<ConstraintViolation<CmDTO>> validateAndSave(CmDTO dto) {
		System.out.println("running validate and save");
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CmDTO>> constraintViolations = validator.validate(dto);
		if(constraintViolations != null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations exsit, return constaintViolation");
			return constraintViolations;
		}else {
			System.out.println("constaintViolations does not exist, data is good");
			return Collections.emptySet();
		}
		
	}

}
