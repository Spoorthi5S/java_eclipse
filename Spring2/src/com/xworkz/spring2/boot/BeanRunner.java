package com.xworkz.spring2.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.things.Bedsheet;
import com.xworkz.spring2.things.Bottle;
import com.xworkz.spring2.things.Charger;
import com.xworkz.spring2.things.GayathriNagar;
import com.xworkz.spring2.things.Laptop;

public class BeanRunner {

	

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(com.xworkz.spring2.configuration.SpringConfiguration.class);
		String[] beanNames = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
	

	String refOfString = (String) spring.getBean("pen","keypad","chair","getString","getFine",String.class);
	System.out.println(refOfString.hashCode());
	
	Boolean refOfBoolean = (Boolean) spring.getBean("boy","lap","book","mouse",Boolean.class);
	System.out.println(Boolean.hashCode(false));
	
	Double refOfDouble = (Double) spring.getBean("rat","hat","number","cgpa","mobile",Double.class);
	System.out.println(Double.hashCode(0));
	
	StringBuffer refOfBuffer = (StringBuffer) spring.getBean("bindu","indu","soap","cream","door",StringBuffer.class);
	System.out.println(StringBuffer.class);
	
	StringBuilder refOfBuilder = (StringBuilder) spring.getBean("box","light","wall","house",StringBuilder.class);
	System.out.println(StringBuilder.class);
	
	Collection refOfCollection = spring.getBean(Collection.class);
	System.out.println(Collection.class);
	
	Map refOfMap = (Map) spring.getBean("Choky",Map.class);
	System.out.println(Map.class);
	
	Laptop laptop = spring.getBean(Laptop.class);
	System.out.println(laptop);
	
	Bottle bottle = spring.getBean(Bottle.class);
	System.out.println(bottle);
	
	GayathriNagar nagar = spring.getBean(GayathriNagar.class);
	System.out.println(nagar);
	
	Charger charger = spring.getBean(Charger.class);
	System.out.println(charger);
	
	Bedsheet sheet = spring.getBean(Bedsheet.class);
	System.out.println(sheet);
	
	
	}
}
