package com.xwrokz.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {
		int shoe1=3;
		int shoe2=4;
		int shoe3=5;
		int shoe4=6;
		int shoe5=7;
		int shoe6=8;
		int shoe7=9;
		int shoe8=10;
		int shoe9=6;
		int shoe10=7;
		int shoe11=5;
		int shoe12=5;
		int shoe13=8;
		int shoe14=4;
		int shoe15=9;
		
		Collection<Integer> shoes=new ArrayList<Integer>();
		shoes.add(shoe1);
		shoes.add(shoe2);
		shoes.add(shoe3);
		shoes.add(shoe4);
		shoes.add(shoe5);
		shoes.add(shoe6);
		shoes.add(shoe7);
		shoes.add(shoe8);
		shoes.add(shoe9);
		shoes.add(shoe10);
		shoes.add(shoe11);
		shoes.add(shoe12);
		shoes.add(shoe13);
		shoes.add(shoe14);
		shoes.add(shoe15);
		
		for(int element:shoes) {
			System.out.println(element);
		}
		
		System.out.println("===================Iterator=================");
		Iterator<Integer> ref=shoes.iterator();
		while(ref.hasNext()) {
			Integer element=ref.next();
			System.out.println(element);
		}
		

	}

}
