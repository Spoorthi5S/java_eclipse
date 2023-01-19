package com.xworkz.Missile.repository;

import org.springframework.stereotype.Component;

import com.xworkz.Missile.dto.MissileDTO;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("running save by spring");
		System.out.println("dto "+ dto);
		return true;
	}

}
