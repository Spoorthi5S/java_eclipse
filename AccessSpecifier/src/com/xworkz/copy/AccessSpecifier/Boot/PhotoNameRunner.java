package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.Photo;
import com.xworkz.copy.AccessSpecifier.PhotoName;

public class PhotoNameRunner {

	public static void main(String[] args) {
Photo photo=new Photo();
		
		
		System.out.println(photo.getBrand());
		System.out.println(photo.getMaterial());
		System.out.println(photo.getWeight());
		System.out.println(photo.getColour());
		System.out.println(photo.getPrice());
		System.out.println(photo.isQuality());
		System.out.println(photo.getQuantity());
		System.out.println(photo.getMountingType());
		System.out.println(photo.isDamage());
		System.out.println(photo.getSize());
		System.out.println(photo.getShape());
		
		PhotoName modify=new PhotoName();
		modify.Frame(photo);
	}

	}


