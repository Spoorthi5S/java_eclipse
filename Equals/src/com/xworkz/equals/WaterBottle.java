package com.xworkz.equals;

public class WaterBottle {
	private String brand;
	private String type;
	private boolean steel;
	private int liter;
	private boolean twoLiter;
	private String color;
	private boolean plastic;
	private boolean design;
	private String capType;
	private boolean HotWater;

	public WaterBottle() {
		System.out.println("Default const of waterBottle");
	}

	public WaterBottle(String brand, String type, boolean steel, int liter, boolean twoLiter, String color,
			boolean plastic, boolean design, String capType, boolean hotWater) {
		super();
		this.brand = brand;
		this.type = type;
		this.steel = steel;
		this.liter = liter;
		this.twoLiter = twoLiter;
		this.color = color;
		this.plastic = plastic;
		this.design = design;
		this.capType = capType;
		HotWater = hotWater;
	}
	
	@Override
	public boolean equals(Object other) {
		System.out.println("running equals mathod in waterBottle");
		if (other instanceof WaterBottle) {
			System.out.println("other is WaterBottle");
			WaterBottle waterbottle = (WaterBottle) other;
			if(this.color.equals(waterbottle.color) && this.capType.equals(waterbottle.capType) && this.brand.equals(waterbottle.brand)) {
				System.out.println("are same");
				return true;
			}
		}
		else {
			System.out.println("other is not WaterBottle");
		
		return false;
		}
		return HotWater;
	
	}

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", type=" + type + ", steel=" + steel + ", liter=" + liter
				+ ", twoLiter=" + twoLiter + ", color=" + color + ", plastic=" + plastic + ", design=" + design
				+ ", capType=" + capType + ", HotWater=" + HotWater + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSteel() {
		return steel;
	}

	public void setSteel(boolean steel) {
		this.steel = steel;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public boolean isTwoLiter() {
		return twoLiter;
	}

	public void setTwoLiter(boolean twoLiter) {
		this.twoLiter = twoLiter;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPlastic() {
		return plastic;
	}

	public void setPlastic(boolean plastic) {
		this.plastic = plastic;
	}

	public boolean isDesign() {
		return design;
	}

	public void setDesign(boolean design) {
		this.design = design;
	}

	public String getCapType() {
		return capType;
	}

	public void setCapType(String capType) {
		this.capType = capType;
	}

	public boolean isHotWater() {
		return HotWater;
	}

	public void setHotWater(boolean hotWater) {
		HotWater = hotWater;
	}
	

}
