package com.xworkz.Missile.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Missile.configuration.MissileConfiguration;
import com.xworkz.Missile.dto.MissileDTO;
import com.xworkz.Missile.service.MissileService;


public class MissileRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MissileConfiguration.class);
		MissileService service =container.getBean(MissileService.class);
		boolean saved = service.validateAndSave(new MissileDTO());
		System.out.println("saved " + saved);
	}

	
}
