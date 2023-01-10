package com.xworkz.Bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.Bean.thing.Actor;
import com.xworkz.Bean.thing.Rocket;
import com.xworkz.Bean.thing.Season;
@Configuration
@ComponentScan("com.xworkz.Bean")
public class BeanConfiguration {
	
	public BeanConfiguration() {
		System.out.println("Created BeanConfiguration...");
		
		}
		
		@Bean
		public Rocket spaceship() {
			System.out.println("Registering spaceship by spring..");
			Rocket rocket=new Rocket();
			return rocket;
		}
		
		@Bean
		public Actor hero() {
			System.out.println("Registering hero by spring..");
			Actor actor=new Actor("Viraat", "Kannada", 29);
			return actor;
		}
		
		@Bean
		public Season monsoon() {
			System.out.println("Registering Monsoon by spring..");
			Season season=new Season();
			season.setName("VarshaRitu");
			season.setDuration(2);
			season.setStartingMonth("july");
			return season;
		}

}
