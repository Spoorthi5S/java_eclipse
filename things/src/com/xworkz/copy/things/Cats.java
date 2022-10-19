package com.xworkz.copy.things;

public class Cats {
	public String type;
	public String eye_color;
	public int age;
	public String color;
	public boolean healthy;
	
	public String[] breed;
	public float[] height;
	public int[] total_cats;
	public String[] food_brand;
	public String[] colors;
	public char[] gender;
	
	public Cats(String type,String eye_color,int age,String color,boolean healthy,String[] breed,float[] height,int[] total_cats,String[] food_brand,String[] colors,char[] gender) {
		this.type=type;
		this.eye_color=eye_color;
		this.age=age;
		this.color=color;
		this.healthy=healthy;
		this.breed=breed;
		this.height=height;
		this.total_cats=total_cats;
		this.food_brand=food_brand;
		this.colors=colors;
		this.gender=gender;
		
	}
	public void display() {
		
		
		System.out.println(this.breed);
		for (int i = 0; i < breed.length; i++) {
			String ref=breed[i];
			System.out.println(ref);
		}
		System.out.println(this.height);
		for (int i = 0; i < height.length; i++) {
			float ref=height[i];
			System.out.println(ref);
		}
		System.out.println(this.total_cats);
		for (int i = 0; i < total_cats.length; i++) {
			int ref=total_cats[i];
			System.out.println(ref);
		}
		System.out.println(this.food_brand);
		for (int i = 0; i < food_brand.length; i++) {
			String ref=food_brand[i];
			System.out.println(ref);
		}
		System.out.println(this.colors);
		for (int i = 0; i < colors.length; i++) {
			String ref=colors[i];
			System.out.println(ref);
		}
		System.out.println(this.gender);
		for (int i = 0; i < gender.length; i++) {
			char ref=gender[i];
			System.out.println(ref);
		}

}

}