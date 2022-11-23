package com.xworkz.equals.boot;

import com.xworkz.equals.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital = new Hospital("All India Institution Of Medical Science",35,"chandru","Arunji",55,"Delhi",150,"Social Fund","AnuneetSabharwal","JotinderKhanna");
		System.out.println(hospital);
		
		
		Hospital hospital1 = new Hospital("Sahyadri Narayana Multispeciality Hospital",54,"AparnaJ","MahendraKota",75,"Shimoga",350,"Social Fund","Vidya Javali","DeviPrasadHegde");
		System.out.println(hospital1);
		
		
		boolean patient =hospital.equals(hospital1);
		System.out.println(patient);
		
		
		
	}

	

}
