package com.xworkz.copy.AccessSpecifier;

public class SystemType {
	public void Type (System laptop) {
		laptop.setBrand(null);
		laptop.setModelName(null);
		laptop.setProcessorBrand(null);
		laptop.setProcessorName(null);
		laptop.setGraphicProcessor(null);
		laptop.setLaunchYear(0);
		laptop.setCapacityOfSSD(0);
		laptop.setPrice(0);
		laptop.setRam(0);
		laptop.setBatteryBackUp(0);
		laptop.setWarranty(0);
		
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getModelName());
		System.out.println(laptop.getProcessorBrand());
		System.out.println(laptop.processorName);
		System.out.println(laptop.getGraphicProcessor());
		System.out.println(laptop.getLaunchYear());
		System.out.println(laptop.getCapacityOfSSD());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getRam());
		System.out.println(laptop.getBatteryBackUp());
		System.out.println(laptop.getWarranty());
	}

}
