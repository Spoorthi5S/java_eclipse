package com.xworkz.autowire.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowire.configuration.CloneConfiguration;
import com.xworkz.autowire.things.Assistant;
import com.xworkz.autowire.things.Company;
import com.xworkz.autowire.things.Location;
import com.xworkz.autowire.things.Movie;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(CloneConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Movie refOfMovie = container.getBean(Movie.class);
		System.out.println(refOfMovie);
		refOfMovie.checkPropertyRef();
	}

}
