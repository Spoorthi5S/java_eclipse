package com.xworkz.copy.AccessSpecifier;

public class ShopName {
	
	public String name="MagicGiftStore";
	public Cream cream;
	
	public void typeCream(Cream cream) {
		cream.setCream("ponds", 3, 244.9, "Unilever", "BeautyProducts", "white", 450f, false, true, true, 4.6f);
		
		System.out.println(name);
		System.out.println(cream.owner);
		System.out.println(cream.quantity);
		System.out.println(cream.brand);
		System.out.println(cream.color);
		System.out.println(cream.gelly);
		System.out.println(cream.grams);
		System.out.println(cream.pimple);
		System.out.println(cream.price);
		System.out.println(cream.purpose);
		System.out.println(cream.quality);
		System.out.println(cream.white);
	
	}
	
	

}
