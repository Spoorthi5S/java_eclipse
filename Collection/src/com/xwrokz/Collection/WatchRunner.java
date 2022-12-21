package com.xwrokz.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {

	public static void main(String[] args) {
		
		String watch1="Sonata";
		String watch2="Titan";
		String watch3="Fastrack";
		String watch4="Rolex";
		String watch5="Omega";
		
		Collection<String> watches=new ArrayList<String>();
		watches.add(watch1);
		watches.add(watch2);
		watches.add(watch3);
		watches.add(watch4);
		watches.add(watch5);
		
		for(String element : watches) {
			System.out.println(element);
		}
		
		System.out.println("=======Iterator============");
		Iterator<String> ref = watches.iterator();
		while(ref.hasNext()) {
			String element = ref.next();
			System.out.println(element);
		}
		
	}

}
