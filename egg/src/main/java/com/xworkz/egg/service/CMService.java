package com.xworkz.egg.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.egg.dto.CmDTO;

public interface CMService {

	Set <ConstraintViolation<CmDTO>>validateAndSave(CmDTO dto);
}
