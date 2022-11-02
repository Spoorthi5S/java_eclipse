package com.xworkz.copy.AccessSpecifier;

public class PhotoName {
	public void Frame(Photo photoframe) {

		photoframe.setMaterial("wood");
		System.out.println("modified material :" + photoframe.getMaterial());
		photoframe.setSize('L');
		System.out.println("modified size :" + photoframe.getSize());
		photoframe.setQuality(false);
		System.out.println("modified quality :" + photoframe.isQuality());
		photoframe.setQuantity(5);
		System.out.println("modified quantity :" + photoframe.getQuantity());
		photoframe.setPrice(2000);
		System.out.println("modified price :" + photoframe.getPrice());
		photoframe.setBrand("picrazze");
		System.out.println("modified brand :" + photoframe.getBrand());
		photoframe.setColour("red");
		System.out.println("modified colour :" + photoframe.getColour());
		photoframe.setMountingType("wall");
		System.out.println("modified mounting type :" + photoframe.getMountingType());
		photoframe.setDamage(true);
		System.out.println("modified damaged or not :" + photoframe.isDamage());
		photoframe.setShape("square");
		System.out.println("modified shape :" + photoframe.getShape());
		photoframe.setWeight(500);
		System.out.println("modified weight :" + photoframe.getWeight());

	}

}
