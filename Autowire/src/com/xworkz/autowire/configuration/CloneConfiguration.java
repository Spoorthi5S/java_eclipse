package com.xworkz.autowire.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowire")
public class CloneConfiguration {
	
	public CloneConfiguration() {
		System.out.println("Created cloneConfiguration no-args const by spring..");
	}

}
