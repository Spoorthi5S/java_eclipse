package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.*;

public class BagRunner {

	public static void main(String[] args) {
		Bag bagIn=new Bag();
		LaptopBag laptop=new LaptopBag();
		bagIn.use(laptop);
		System.out.println(laptop.getBrand());
		

	}

}
