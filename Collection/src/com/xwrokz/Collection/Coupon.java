package com.xwrokz.Collection;

import java.util.Collection;
import java.util.TreeSet;

public class Coupon {

	public static void main(String[] args) {
		String coupon1 = "sphhf";
		String coupon2 = "ad4hjk";
		String coupon3 = "jhkgk";
		String coupon4 = "kkghfd";
		String coupon5 = "jhdkjdh6";
		String coupon6 = "ktugh5";
		String coupon7 = "w4hV";
		String coupon8 = "fhgj5";
		String coupon9 = "ghioa";
		String coupon10 = "jrwj";
		String coupon11 = "sdjy";
		String coupon12 = "zkngA2";

		Collection<String> collection = new TreeSet();
		collection.add(coupon1);
		collection.add(coupon2);
		collection.add(coupon3);
		collection.add(coupon4);
		collection.add(coupon5);
		collection.add(coupon6);
		collection.add(coupon7);
		collection.add(coupon8);
		collection.add(coupon9);
		collection.add(coupon10);
		collection.add(coupon11);
		collection.add(coupon12);
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}

}
