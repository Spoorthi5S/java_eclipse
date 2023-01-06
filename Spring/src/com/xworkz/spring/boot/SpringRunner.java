package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Chocolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class SpringRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Road ref = spring.getBean(Road.class);
		System.out.println(ref);
		
		Bus ref1 = spring.getBean(Bus.class);
		System.out.println(ref1);
		
		Cycle ref2 = spring.getBean(Cycle.class);
		System.out.println(ref2);
		
		Girl ref3 = spring.getBean(Girl.class);
		System.out.println(ref3);
		
		Milk ref4 = spring.getBean(Milk.class);
		System.out.println(ref4);
		
		Mask ref5 = spring.getBean(Mask.class);
		System.out.println(ref5);
		
		Patient ref6 = spring.getBean(Patient.class);
		System.out.println(ref6);
		
		Chocolate ref7 = spring.getBean(Chocolate.class);
		System.out.println(ref7);
		
		Area ref8 = spring.getBean(Area.class);
		System.out.println(ref8);
		
		City ref9 = spring.getBean(City.class);
		System.out.println(ref9);
		
		Fish ref10 = spring.getBean(Fish.class);
		System.out.println(ref10);
		
		Temple ref11 = spring.getBean(Temple.class);
		System.out.println(ref11);
		
		God ref12 = spring.getBean(God.class);
		System.out.println(ref12);
		
		Park ref13 = spring.getBean(Park.class);
		System.out.println(ref13);
		
		Mall ref14 = spring.getBean(Mall.class);
		System.out.println(ref14);
		
		Application ref15 = spring.getBean(Application.class);
		System.out.println(ref15);
		
		
	}

}
