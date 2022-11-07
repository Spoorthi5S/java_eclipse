package com.xworkz.copy.Inheritane.boot;

import com.xworkz.copy.Inheritane.task.Court;
import com.xworkz.copy.Inheritane.task.DistrictCourt;
import com.xworkz.copy.Inheritane.task.HighCourt;
import com.xworkz.copy.Inheritane.task.SupremeCourt;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court court=new Court();
		System.out.println("starting of court");
		System.out.println(court.country);
		System.out.println(court.type);
		
		Court court1=new HighCourt();
		HighCourt highcourt=(HighCourt) court1;
		System.out.println("starting of HighCourt");
		System.out.println(highcourt.age);
		System.out.println(highcourt.country);
		System.out.println(highcourt.judgeName);
		System.out.println(highcourt.type);
		
		Court court2=new SupremeCourt();
		SupremeCourt supreme=(SupremeCourt) court2;
		System.out.println("starting of supremeCourt");
		System.out.println(supreme.color);
		System.out.println(supreme.noOfPillers);
		System.out.println(supreme.country);
		System.out.println(supreme.type);
		
		Court court3=new DistrictCourt();
		DistrictCourt district=(DistrictCourt) court3;
		System.out.println("starting of DistrictCourt");
		System.out.println(district.area);
		System.out.println(district.isFemale);
		System.out.println(district.country);
		System.out.println(district.type);
		System.out.println("end of court");

	}

}
