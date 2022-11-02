package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.*;

public class ShopNameRunner {

	public static void main(String[] args) {
		ShopName shop = new ShopName();
		Cream cream= new Cream();
		shop.typeCream(cream);
		System.out.println(cream.getOwner());

	}

}
