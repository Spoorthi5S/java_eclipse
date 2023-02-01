package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class FiConfiguration {

	public FiConfiguration() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
}
