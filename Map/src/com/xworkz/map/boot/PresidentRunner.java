package com.xworkz.map.boot;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PresidentRunner {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("India", "NarendraModi");
		map.put("Bhutan", "Tshering");
		map.put("China", "LiKeqiang");
		map.put("Iraq", "Al Sudani");
		map.put("Japan", "Kishida");
		map.put("Mongolia", "Oyun-Erdene");
		map.put("Norway", "Solberg");
		map.put("Poland", "Morawiecki");
		map.put("Russia", "Mishustin");
		map.put("Singapore", "Loong");
		map.put("Sri Lanka", "Gunawardena");
		map.put("Swaziland", "Dlamini");
		map.put("Thailand", "Chan-o-cha");
		map.put("Uganda", "Nabbanja");
		map.put("United Kingdom", "Sunak");
		map.put("Ukraine", "Shmyhal");
		map.put("Turkey", "Yaldiram");
		map.put("United Arab Emirates", "Mohammed");

		map.keySet().stream().sorted((a1, a2) -> a1.compareTo(a2)).forEach((e) -> System.out.println(e));
		System.out.println("==============================================================");
		map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		System.out.println("==============================================================");
		List<String> valu = map.values().stream().collect(Collectors.toList());
		valu.stream().filter(e -> e.length() >= 10).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("================================================================");
		for (String string : valu) {
			if (string.length() > 10) {
				string.replaceAll("/s", "update");
			}

		}

	}

}
