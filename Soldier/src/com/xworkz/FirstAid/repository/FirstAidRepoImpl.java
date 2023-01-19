package com.xworkz.FirstAid.repository;

import org.springframework.stereotype.Component;

import com.xworkz.FirstAid.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO aidDto) {
		System.out.println("running save in repo");
		System.out.println("aidDto "+ aidDto);
		return true;
	}

}
