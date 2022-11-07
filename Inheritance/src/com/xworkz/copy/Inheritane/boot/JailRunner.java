package com.xworkz.copy.Inheritane.boot;

import com.xworkz.copy.Inheritane.task.CentralJail;
import com.xworkz.copy.Inheritane.task.Jail;
import com.xworkz.copy.Inheritane.task.SpecialJail;
import com.xworkz.copy.Inheritane.task.WomensJail;

public class JailRunner {

	public static void main(String[] args) {
		Jail jail=new Jail();
		System.out.println("starting of jail");
		System.out.println(jail.name);
		System.out.println(jail.strict);
		
		Jail jail1=new CentralJail();
		CentralJail central=(CentralJail) jail1;
		System.out.println("Starting of CentalJail");
		System.out.println(central.number);
		System.out.println(central.state);
		System.out.println(central.name);
		System.out.println(central.strict);
		
		Jail jail2=new SpecialJail();
		SpecialJail special=(SpecialJail) jail2;
		System.out.println("starting of SpecialJail");
		System.out.println(special.security);
		System.out.println(special.totalCapacity);
		System.out.println(special.name);
		System.out.println(special.strict);
		
		Jail jail3=new WomensJail();
		WomensJail womens=(WomensJail) jail3;
		System.out.println("starting of womensJail");
		System.out.println(womens.male);
		System.out.println(womens.place);
		System.out.println(womens.name);
		System.out.println(womens.strict);
		System.out.println("ending of jail");

	}

}
