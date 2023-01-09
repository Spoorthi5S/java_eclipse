package com.xworkz.spring2.configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class SpringConfiguration {

	@Bean
	public String chair() {
		System.out.println("Registering Chair with Spring");
		String string = new String();
		return string;
	}

	@Bean
	public String pen() {
		System.out.println("Registering pen with Spring..");
		String string = new String();
		return string;
	}

	@Bean
	public String keypad() {
		System.out.println("Registering keypad with Spring..");
		String string2 = new String();
		return string2;
	}

	@Bean
	public String getString() {
		System.out.println("Registering getString with Spring..");
		String string3 = new String();
		return string3;
	}

	@Bean
	public String getFine() {
		System.out.println("Registering getFine with Spring..");
		String string4 = new String();
		return string4;
	}

	@Bean
	public Boolean girl() {
		System.out.println("Registering girl with Spring..");
		Boolean bool = new Boolean(false);
		return bool;
	}

	@Bean
	public Boolean boy() {
		System.out.println("Registering boy with Spring..");
		Boolean bool = new Boolean(false);
		return bool;
	}

	@Bean
	public Boolean book() {
		System.out.println("Registering book with Spring..");
		Boolean bool = new Boolean(true);
		return bool;
	}

	@Bean
	public Boolean lap() {
		System.out.println("Registering lap with Spring..");
		Boolean bool = new Boolean(false);
		return bool;

	}

	@Bean
	public Boolean mouse() {
		System.out.println("Registering mouse with Spring..");
		Boolean bool = new Boolean(true);
		return bool;
	}

	@Bean
	public Double hat() {
		System.out.println("Registering hat with spring..");
		Double ref = new Double(0);
		return ref;
	}

	@Bean
	public Double rat() {
		System.out.println("Registering rat with spring..");
		Double ref = new Double(0);
		return ref;
	}

	@Bean
	public Double number() {
		System.out.println("Registering number with spring..");
		Double ref = new Double(0);
		return ref;
	}

	@Bean
	public Double mobile() {
		System.out.println("Registering mobile with spring..");
		Double ref = new Double(0);
		return ref;
	}

	@Bean
	public Double cgpa() {
		System.out.println("Registering cgpa with spring..");
		Double ref = new Double(5.3);
		return ref;
	}

	@Bean
	public StringBuffer bindu() {
		System.out.println("regestering bindu by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuffer indu() {
		System.out.println("regestering indu by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuffer soap() {
		System.out.println("regestering soap by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuffer cream() {
		System.out.println("regestering cream by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuffer door() {
		System.out.println("regestering door by spring");
		StringBuffer buffer = new StringBuffer();
		return buffer;
	}

	@Bean
	public StringBuilder building() {
		System.out.println("regitering building by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder box() {
		System.out.println("regitering box by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder light() {
		System.out.println("regitering light by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder wall() {
		System.out.println("regitering wall by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public StringBuilder house() {
		System.out.println("regitering house by spring..");
		StringBuilder builder = new StringBuilder();
		return builder;
	}

	@Bean
	public void weekDays() {
		Collection<String> collection = new ArrayList<String>();
		collection.add("monday");
		collection.add("tuesday");
		collection.add("wednesday");
		collection.add("thrusday");
		collection.add("friday");
		System.out.println(collection.size());
	}

	@Bean("Choky")
	public void Chocolate() {
		Map<String, Double> map = new HashMap();
		map.put("DairyMilk", 100D);
		map.put("Silk", 120D);
		map.put("5_Star", 10D);
		map.put("Munch", 10D);
		map.put("Kaccha_Mango", 50D);
		System.out.println(map.size());
		if (map.isEmpty()) {
			System.out.println("Chocolate price jaasthi aytu");
		} else {
			System.out.println("Chocolate price kammi ide");
		}

		System.out.println(map);
		Set<Entry<String, Double>> entries = map.entrySet();

		for (Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
