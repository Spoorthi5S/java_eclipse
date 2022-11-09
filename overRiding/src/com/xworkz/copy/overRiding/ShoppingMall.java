package com.xworkz.copy.overRiding;

public class ShoppingMall {
	
	public String name;
	public int store;
	public boolean windowShopping;
	
	public ShoppingMall(String name, int store, boolean windowShopping) {
		super();
		this.name = name;
		this.store = store;
		this.windowShopping = windowShopping;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.store);
		System.out.println(this.windowShopping);
		
	}

	public ShoppingMall() {
		super();
	}


	

}
