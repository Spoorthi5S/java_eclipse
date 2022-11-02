package com.xworkz.copy.AccessSpecifier;

public class System {
	
	public static final String out = null;
	private String brand = "Dell";
	String modelName = "Inspiron 3511";
	String processorBrand = "Intel";
	String processorName = "Core-i5";
	String graphicProcessor = "Intel Integrated DDR4";
	double launchYear = 2022;
	double capacityOfSSD = 512;
	double price = 35000;
	int ram = 16;
	int batteryBackUp = 6;
	int warranty = 12;

	public System() {
		
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	void setProcessorBrand(String processorBrand) {
		this.processorBrand = processorBrand;
	}

	void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	void setGraphicProcessor(String graphicProcessor) {
		this.graphicProcessor = graphicProcessor;
	}

	void setLaunchYear(double launchYear) {
		this.launchYear = launchYear;
	}

	void setCapacityOfSSD(double capacityOfSSD) {
		this.capacityOfSSD = capacityOfSSD;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setRam(int ram) {
		this.ram = ram;
	}

	void setBatteryBackUp(int batteryBackUp) {
		this.batteryBackUp = batteryBackUp;
	}

	void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public String getBrand() {
		return brand;
	}

	public String getModelName() {
		return modelName;
	}

	public String getProcessorBrand() {
		return processorBrand;
	}

	public String getProcessorName() {
		return processorName;
	}

	public String getGraphicProcessor() {
		return graphicProcessor;
	}

	public double getLaunchYear() {
		return launchYear;
	}

	public double getCapacityOfSSD() {
		return capacityOfSSD;
	}

	public double getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public int getBatteryBackUp() {
		return batteryBackUp;
	}

	public int getWarranty() {
		return warranty;
	}



}
