package com.xworkz.copy.things.thingsName;

import com.xworkz.copy.things.Bag;

public class BagRunner {

	public static void main(String[] args) {
		String[] brands= {"zara","lv","gucci"};
		int[] quantity= {1,2,3};
		String[] colors= {"red","black"};
		char[] sizes= {'s','m','l'};
		String[] available= {"flipkart","amazon"};
		

		Bag bags=new Bag("handbag",4500,3.5f,"leather",true,brands,quantity,colors,sizes,available);

 	    
 	    bags.display();
		

	}

}
