package com.xworkz.copy.AccessSpecifier;

public class JacketType {
	public void useJacket(Mantle jacket) {
		
		jacket.setBrand("H&M");
		System.out.println("modified brand :"+jacket.getBrand());
		jacket.setType("leather");
		System.out.println("modified type :"+jacket.getType());
		jacket.setBrandOwner("stefan");
		System.out.println("modified brand owner :"+jacket.getBrandOwner());
		jacket.setColour("brown");
		System.out.println("modified colour :"+jacket.getColour());
		jacket.setFounder("Erling");
		System.out.println("modified expiry date :"+jacket.getFounder());
		jacket.setSize('M');
		System.out.println("modified size :"+jacket.getSize());
		jacket.setManufactureCountry("swedish");
		System.out.println("modified manufacture country :"+jacket.getManufactureCountry());
		jacket.setManufactureDate("2021-01-11");
		System.out.println("modified manufacture date :"+jacket.getManufactureDate());
		jacket.setPrice(1500);
		System.out.println("modified price :"+jacket.getPrice());
		jacket.setClothQuality(true);
		System.out.println("modified quality :"+jacket.isClothQuality());
		jacket.setQuantity(10);
		System.out.println("modified quantity :"+jacket.getQuantity());
		}

}
