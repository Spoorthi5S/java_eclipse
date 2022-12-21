package com.xwrokz.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {
		String praani1="Nue";
		String praani2="Bear";
		String praani3="Cat";
		String praani4="Rabbit";
		String praani5="Lion";
		String praani6="Wolf";
		String praani7="Goose";
		String praani8="Bat";
		String praani9="Boar";
		String praani10="Fox";
		
		Collection<String> praani=new ArrayList<String>();
		praani.add(praani10);
		praani.add(praani9);
		praani.add(praani8);
		praani.add(praani7);
		praani.add(praani6);
		praani.add(praani5);
		praani.add(praani4);
		praani.add(praani3);
		praani.add(praani2);
		praani.add(praani1);
		
		for(String element:praani) {
			System.out.println(element);
		}
		
		System.out.println("-----------Iterator-----------------");
		Iterator<String> ref=praani.iterator();
		while(ref.hasNext()) {
			String element=ref.next();
			System.out.println(element);
		}

	}

}
