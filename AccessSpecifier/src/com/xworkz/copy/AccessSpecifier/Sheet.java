package com.xworkz.copy.AccessSpecifier;

public class Sheet {
	
	public String name="Fluffyflex";
	public BedSheet bedsheet;
	
	
	public void useSheet(BedSheet bedsheet)
	{
		
		BedSheet bed=new BedSheet("cotton", "blue", false, false, "rug", 'l', 6, 4.5f, "ancient", true, 459.9d);
		
		System.out.println(name);
		System.out.println(bedsheet.getBrand());
		System.out.println(bedsheet.getColor());
		System.out.println(bedsheet.getDesign());
		System.out.println(bedsheet.getPrice());
		System.out.println(bedsheet.getQuality());
		System.out.println(bedsheet.getQuantity());
		System.out.println(bedsheet.getSize());
		System.out.println(bedsheet.getType());
		System.out.println(bedsheet.isPillowCover());
		System.out.println(bedsheet.isPink());
		System.out.println(bedsheet.isPrinted());
	}


	
	
}
