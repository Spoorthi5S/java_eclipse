package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.JacketType;
import com.xworkz.copy.AccessSpecifier.Mantle;

public class JacketTypeRunner {

	public static void main(String[] args) {
		Mantle jack=new Mantle();
		
		
		System.out.println(jack.getBrand());
		System.out.println(jack.getType());
		System.out.println(jack.getBrandOwner());
		System.out.println(jack.getColour());
		System.out.println(jack.getPrice());
		System.out.println(jack.isClothQuality());
		System.out.println(jack.getQuantity());
		System.out.println(jack.getManufactureDate());
		System.out.println(jack.getManufactureCountry());
		System.out.println(jack.getSize());
		System.out.println(jack.getFounder());
		
		
		JacketType modify = new JacketType();
		modify.useJacket(jack);
		
	}

	}


