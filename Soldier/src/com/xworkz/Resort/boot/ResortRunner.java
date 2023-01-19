package com.xworkz.Resort.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.FirstAid.configuration.SpringConfiguration;
import com.xworkz.FirstAid.dto.FirstAidDTO;
import com.xworkz.FirstAid.service.FirstAidService;
import com.xworkz.Resort.configuration.ResortConfiguration;
import com.xworkz.Resort.dto.ResortDTO;
import com.xworkz.Resort.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new AnnotationConfigApplicationContext(ResortConfiguration.class);
		ResortService service =container.getBean(ResortService.class);
		boolean saved = service.validateAndSave(new ResortDTO());
		System.out.println("saved " + saved);
		

	}

}
