package com.xworkz.copy.AccessSpecifier;

public class PerfumeName {
	public void usePerfume(Perfume perfume) {

		perfume.setBrand("layerr");
		System.out.println("modified brand :"+perfume.getBrand());
		perfume.setName("wattagirl");
		System.out.println("modified name :"+perfume.getName());
		perfume.setBrandOwner("devendra");
		System.out.println("modified brand owner :"+perfume.getBrandOwner());
		perfume.setColour("white");
		System.out.println("modified colour :"+perfume.getColour());
		perfume.setExpiryDate("2024-11-25");
		System.out.println("modified expiry date :"+perfume.getExpiryDate());
		perfume.setFragrance("strong");
		System.out.println("modified fragrance :"+perfume.getFragrance());
		perfume.setManufactureCountry("india");
		System.out.println("modified manufacture country :"+perfume.getManufactureCountry());
		perfume.setManufactureDate("2020-01-11");
		System.out.println("modified manufacture date :"+perfume.getManufactureDate());
		perfume.setPrice(500);
		System.out.println("modified price :"+perfume.getPrice());
		perfume.setQuality(false);
		System.out.println("modified quality :"+perfume.isQuality());
		perfume.setQuantity(1);
		System.out.println("modified quantity :"+perfume.getQuantity());
		
		
	}


}
