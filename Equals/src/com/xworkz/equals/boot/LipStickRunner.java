package com.xworkz.equals.boot;

import com.xworkz.equals.LipStick;

public class LipStickRunner {

	public static void main(String[] args) {
		LipStick lips = new LipStick("lipstick",444,"Lakme","red",false,"Hindustan Unilever","Low Price","Mumbai","Red Bull","GST");
		System.out.println(lips);
		
		
		
		LipStick lips1 = new LipStick(null, 0, null, null, false, null, null, null, null, null);
		System.out.println(lips1);
		
		
		boolean lips2 = lips.equals(lips1);
		System.out.println(lips2);
		
	}

}
