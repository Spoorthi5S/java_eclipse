package com.xworkz.equals.boot;

import com.xworkz.equals.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		
		Paint paint = new Paint();
		paint.setArt(false);
		paint.setBrand("Nippon");
		paint.setColor("red");
		paint.setPlace("Malaysia");
		paint.setGuarantee(false);
		paint.setHighOpacity(true);
		paint.setPigments(true);
		paint.setPolymersPresent(4);
		paint.setPrice(350);
		paint.setType(8);
		
		Paint paint1 = new Paint("Japan","Nippon",450,true,"Blue",false,5,false,true,7);
		System.out.println(paint1);
		
		boolean same=paint.equals(paint1);
		System.out.println(same);
		if(paint.getBrand().equals(paint1.getBrand()))
		{
			System.out.println("Paint is same..");
		}

	}

}
