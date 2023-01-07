package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Company {

	public static void main(String[] args) {
		Map<String, String> map=new HashMap();
		map.put("Microsoft", "MS_office");
		map.put("Software_heros", "java");
		map.put("Wipro", "java_1.8");
		map.put("Infosys", "c");
		map.put("Harman", "PHP");
		map.put("IBM", "IDE");
		map.put("TCS", "C++");
		map.put("Oracle", "java_11");
		map.put("SAP", "Cloud");
		map.put("DXC", "Sql");
		System.out.println(map.size());
		
		if(map.isEmpty()) {
			System.out.println("High ratings ide");
		}
		else {
			System.out.println("High ratings illa");
		}
		
		Set<String> keys=map.keySet();
		
		keys.forEach(e->System.out.println(e));
		
		System.out.println("======VALUES======");
		Collection<String> values=map.values();
		values.forEach(v->System.out.println(v));
		
		System.out.println("LOOP AS A PAIR");
		
		System.out.println(map);
		Set<Entry<String, String>> entries = map.entrySet();
		
		for(Entry<String, String> entry:entries) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
	}

}
