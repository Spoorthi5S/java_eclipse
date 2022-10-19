package com.xworkz.copy.things;

public class MobilePhone {
	public String[] MobileType;
	public int ratings;
	public String[] brand;
	public String[] features;
	public boolean sixGbRam;
	public boolean camera;
	public String[] backCover;
	public boolean keypadMobile;
	public String[] keypadMobileBrand;
	public int Price;
	public String[] color;
	
	public MobilePhone(String[] MobileType,int ratings,String[] brand,String[] features,boolean sixGbRam,boolean camera,
			String[] backCover,boolean keypadMobile,String[] keypadMobileBrand,int Price,String[] color) {
		this.MobileType=MobileType;
		this.ratings=ratings;
		this.brand=brand;
		this.features=features;
		this.sixGbRam=sixGbRam;
		this.camera=camera;
		this.backCover=backCover;
		this.keypadMobile=keypadMobile;
		this.keypadMobileBrand=keypadMobileBrand;
		this.Price=Price;
		this.color=color;
	}
	public void display()
	{
		System.out.println(this.ratings);
		for (int i = 0; i < MobileType.length; i++) {
			String string = MobileType[i];
			System.out.println(string);
		}
		for (int i = 0; i < brand.length; i++) {
			String string = brand[i];
			System.out.println(string);
		}
		for (int i = 0; i < features.length; i++) {
			String string = features[i];
			System.out.println(string);
		}
		System.out.println(this.sixGbRam);
		System.out.println(this.camera);
		for (int i = 0; i < backCover.length; i++) {
			String string = backCover[i];
			System.out.println(string);
		}
		System.out.println(this.keypadMobile);
		for (int i = 0; i < keypadMobileBrand.length; i++) {
			String string = keypadMobileBrand[i];
			System.out.println(string);
		}
		System.out.println(this.Price);
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		
	}

}
