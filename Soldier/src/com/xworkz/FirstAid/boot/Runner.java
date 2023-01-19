package com.xworkz.FirstAid.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.FirstAid.configuration.SpringConfiguration;
import com.xworkz.FirstAid.dto.FirstAidDTO;
import com.xworkz.FirstAid.service.FirstAidService;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service =container.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println("saved " + saved);
		

	}

}
