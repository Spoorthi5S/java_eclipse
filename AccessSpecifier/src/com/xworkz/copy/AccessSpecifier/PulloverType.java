package com.xworkz.copy.AccessSpecifier;

public class PulloverType {
public void useSweater(Pullover pullover) {
		
	pullover.setBrand("Mango");
		System.out.println(" brand :"+pullover.getBrand());
		pullover.setType("cardigan");
		System.out.println("type :"+pullover.getType());
		pullover.setBrandOwner("isac andic");
		System.out.println("brand owner :"+pullover.getBrandOwner());
		pullover.setColour("maroon");
		System.out.println("colour :"+pullover.getColour());
		pullover.setFounder("nahman");
		System.out.println("expiry date :"+pullover.getFounder());
		pullover.setSize('S');
		System.out.println("size :"+pullover.getSize());
		pullover.setManufactureCountry("catalonia");
		System.out.println("manufacture country :"+pullover.getManufactureCountry());
		pullover.setManufactureDate("2021-01-11");
		System.out.println("manufacture date :"+pullover.getManufactureDate());
		pullover.setPrice(15000);
		System.out.println("price :"+pullover.getPrice());
		pullover.setComfy(true);
		System.out.println("quality :"+pullover.isComfy());
		pullover.setQuantity(1);
		System.out.println("quantity :"+pullover.getQuantity());
}

}
