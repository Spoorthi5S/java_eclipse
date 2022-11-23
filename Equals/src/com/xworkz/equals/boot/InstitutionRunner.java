package com.xworkz.equals.boot;

import com.xworkz.equals.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institution insti = new Institution("X-Workz",200,"Akshara","Omkar",5,"Shimoga",22000,"NA","Spoorthi","Omkar");
		System.out.println(insti);
		

		Institution insti1 = new Institution("J-Spider",600,"Rachana","Kumar",8,"Shimoga",38000,"NA","Rachana","Sharath");
		System.out.println(insti1);
		
		
		boolean insti2 = insti.equals(insti1);
		System.out.println(insti2);
		
		

	}

}
