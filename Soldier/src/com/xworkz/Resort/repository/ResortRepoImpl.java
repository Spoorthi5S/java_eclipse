package com.xworkz.Resort.repository;

import org.springframework.stereotype.Component;


import com.xworkz.Resort.dto.ResortDTO;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO resortDto) {
		System.out.println("running save by spring");
		System.out.println("resortDto "+ resortDto);
		return true;
	}

}
