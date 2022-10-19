package com.xworkz.copy.things;

public class Bag {
	public String type;
	public double price;
	public float weight;
	public String material;
	public boolean quality;
	
	public String[] brands;
	public int[] quantity;
	public String[] colors;
	public char[] sizes;
	public String[] available;
	
	public Bag(String type,double price,float weight,String material,boolean quality,String[] brands,int[] quantity,String[] colors,char[] sizes,String[] available) {
       this.type=type;
       this.price=price;
       this.weight=weight;
       this.material=material;
       this.quality=quality;
       this.brands=brands;
       this.quantity=quantity;
       this.colors=colors;
       this.sizes=sizes;
       this.available=available;
       
	}
      
	public void display() {
    	   
    	   System.out.println(this.brands);
    	   for (int i = 0; i < brands.length; i++) {
			String ref=brands[i];
			System.out.println(ref);
		}
    	   System.out.println(this.quantity);
    	   for (int i = 0; i < quantity.length; i++) {
			int ref=quantity[i];
			System.out.println(ref);
		}
    	   System.out.println(this.colors);
    	   for (int i = 0; i < colors.length; i++) {
			String ref=colors[i];
			System.out.println(ref);
		}
    	    System.out.println(this.sizes);
    	    for (int i = 0; i < sizes.length; i++) {
		    char ref=sizes[i];
			System.out.println(ref);
		}
    	    System.out.println(this.available);
     	   for (int i = 0; i < available.length; i++) {
 			String ref=available[i];
 			System.out.println(ref);
 		}
       }
}

