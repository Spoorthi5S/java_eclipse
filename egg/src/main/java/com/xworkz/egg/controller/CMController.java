package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CmDTO;
import com.xworkz.egg.service.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {
	@Autowired
	private CMService cmService;

	public CMController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCm(CmDTO dto, Model model) {
		System.out.println("running onCm" + dto);
		Set<ConstraintViolation<CmDTO>> constraintViolations = this.cmService.validateAndSave(dto);
		if (!constraintViolations.isEmpty()) {
			System.out.println("Validation failed, display error messages");
			constraintViolations.forEach((cv) -> System.err.println(cv.getMessage()));

		} else {
			System.out.println("validation success, display success message");
		}
		return "CM";
	}
}
