package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.Perfume;
import com.xworkz.copy.AccessSpecifier.PerfumeName;

public class PerfumeNameRunner {

	public static void main(String[] args) {
Perfume perfume=new Perfume();
		
		
		System.out.println(perfume.getBrand());
		System.out.println(perfume.getName());
		System.out.println(perfume.getBrandOwner());
		System.out.println(perfume.getColour());
		System.out.println(perfume.getPrice());
		System.out.println(perfume.isQuality());
		System.out.println(perfume.getQuantity());
		System.out.println(perfume.getManufactureDate());
		System.out.println(perfume.getManufactureCountry());
		System.out.println(perfume.getExpiryDate());
		System.out.println(perfume.getFragrance());
		
		
		PerfumeName modify = new PerfumeName();
		modify.usePerfume(perfume);
		
	}

	}


