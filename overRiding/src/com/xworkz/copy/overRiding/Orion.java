package com.xworkz.copy.overRiding;

public class Orion extends ShoppingMall{
	
	public String area;
	public Orion(String name, int store, boolean windowShopping, String area) {
		super(name, store, windowShopping);
		this.area = area;
	}

	public Orion() {
		super();
	}

	public void display() {
		System.out.println(this.area);
		System.out.println(this.name);
		System.out.println(this.store);
		System.out.println(this.windowShopping);
	}
}
 