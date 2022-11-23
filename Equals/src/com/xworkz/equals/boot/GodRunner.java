package com.xworkz.equals.boot;

import com.xworkz.equals.God;

public class GodRunner {

	public static void main(String[] args) {
		God god=new God("Shiva","male",2,false,"Kailasa","parvathi",50000,true,"ganesha","Damaruga");
		System.out.println(god);
		
		God god1=new God("Krishna","male",1,false,"Brundavana","Rukmini",4000, true, "charu", "Flute");
		System.out.println(god1);
		
		boolean same = god.equals(god1);
		System.out.println(same);
		

	}

}
