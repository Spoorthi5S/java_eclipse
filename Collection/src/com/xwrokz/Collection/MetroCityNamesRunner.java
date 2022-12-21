package com.xwrokz.Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MetroCityNamesRunner {

	public static void main(String[] args) {
		
		String city1="Mumbai";
		String city2="Delhi";
		String city3="Banglore";
		String city4="Chennai";
		String city5="Ahmedabad";
		
		Collection<String> cites=new LinkedList<String>();
		cites.add(city1);
		cites.add(city5);
		cites.add(city4);
		cites.add(city3);
		cites.add(city2);
		
		for(String element:cites) {
			System.out.println(element);
		}
		
		System.out.println("*****************Iterator***************");
		Iterator<String> ref=cites.iterator();
		while(ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}

	}

}
