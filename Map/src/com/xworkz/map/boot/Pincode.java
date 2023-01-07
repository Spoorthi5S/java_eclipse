package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Pincode {

	public static void main(String[] args) {
		Map<Long, String> map=new HashMap();
		map.put(577201L, "Basavangudi_shimoga");
		map.put(560090L, "Bengaluru_North");
		map.put(560010L, "Rajajinagar_bang");
		map.put(560055L, "Malleshwaram");
		map.put(560060L, "Banglore_rural");
		map.put(590001L, "Belgaum");
		map.put(583101L, "Bellary");
		map.put(585226L, "Bidar");
		map.put(577501L, "Chitradurga");
		map.put(577001L, "Davangere");
		
System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("pincode sari ide");
		}
		else {
			System.out.println("pincode sari illa");
		}
		
		Set<Long> keys=map.keySet();
		
		keys.forEach(e->System.out.println(e));
		
		System.out.println("======VALUES======");
		Collection<String> values=map.values();
		values.forEach(v->System.out.println(v));
		
		System.out.println("LOOP AS A PAIR");
		
		System.out.println(map);
		Set<Entry<Long,String>> entries = map.entrySet();
		
		for(Entry<Long,String>entry:entries) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
	}

}
