package com.xworkz.Bean.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Bean.configuration.BeanConfiguration;
import com.xworkz.Bean.thing.Actor;
import com.xworkz.Bean.thing.Rocket;
import com.xworkz.Bean.thing.Season;

public class BeanRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		String[] bean = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		
		Rocket refOfRocket = container.getBean("rocket",Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());

		Rocket refOfRocket1 = container.getBean("spaceship", Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket1.getCountry());
		System.out.println(refOfRocket1.getName());
		System.out.println(refOfRocket1.getBudget());

		Actor refOfActor = container.getBean("actor", Actor.class);
		System.out.println(refOfActor);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getAge());

		Actor refOfActor1 = container.getBean("hero", Actor.class);
		System.out.println(refOfActor1);
		System.out.println(refOfActor1.getName());
		System.out.println(refOfActor1.getLanguage());
		System.out.println(refOfActor1.getAge());

		Season refOfSeason = container.getBean("season",Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getDuration());
		System.out.println(refOfSeason.getStartingMonth());

		Season refOfSeason1 = container.getBean("monsoon", Season.class);
		System.out.println(refOfSeason1);
		System.out.println(refOfSeason1.getName());
		System.out.println(refOfSeason1.getDuration());
		System.out.println(refOfSeason1.getStartingMonth());
	}

}
