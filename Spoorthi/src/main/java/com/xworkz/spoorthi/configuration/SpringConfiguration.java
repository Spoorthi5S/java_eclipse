package com.xworkz.spoorthi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spoorthi")
public class SpringConfiguration {
public SpringConfiguration() {
	System.out.println("created "+this.getClass());
}
}
