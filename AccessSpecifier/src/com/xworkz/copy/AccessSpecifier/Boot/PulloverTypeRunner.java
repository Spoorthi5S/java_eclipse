package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.Pullover;
import com.xworkz.copy.AccessSpecifier.PulloverType;

public class PulloverTypeRunner {

	public static void main(String[] args) {
		Pullover pullover=new Pullover();
		
		System.out.println(pullover.getBrand());
		System.out.println(pullover.getBrandOwner());
		System.out.println(pullover.getColour());
		System.out.println(pullover.getFounder());
		System.out.println(pullover.getManufactureCountry());
		System.out.println(pullover.getManufactureDate());
		System.out.println(pullover.getPrice());
		System.out.println(pullover.getQuantity());
		System.out.println(pullover.getSize());
		System.out.println(pullover.getType());
		System.out.println(pullover.isComfy());
		
		PulloverType modify = new PulloverType();
		modify.useSweater(pullover);

	}

}
