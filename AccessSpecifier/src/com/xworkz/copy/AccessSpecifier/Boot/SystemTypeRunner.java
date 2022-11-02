package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.*;
import com.xworkz.copy.AccessSpecifier.System;

public class SystemTypeRunner {

	public static void main(String[] args) {
		System laptop=new System();
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getModelName());
		System.out.println(laptop.getProcessorBrand());
		System.out.println(laptop.getProcessorName());
		System.out.println(laptop.getGraphicProcessor());
		System.out.println(laptop.getLaunchYear());
		System.out.println(laptop.getCapacityOfSSD());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getRam());
		System.out.println(laptop.getBatteryBackUp());
		System.out.println(laptop.getWarranty());
		System.out.println("==========================");
		SystemType laptopAlter = new SystemType();
		laptopAlter.Type(laptop);
		

	}

	}


