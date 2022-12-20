package com.xwrokz.Collection;

import java.util.Collection;
import java.util.TreeSet;

public class Currency {

	public static void main(String[] args) {
		String currency1="indian rupee";
		String currency2="US dollar";
		String currency3="euro";
		String currency4="pound sterling";
		String currency5="australian dollar";
		String currency6="canadian dollar";
		String currency7="swiss franc";
		String currency8="singapur dollar";
		String currency9="japanese yen";
		String currency10="russian ruble";
		String currency11="hong kong dollar ";
		String currency12="south african rand";
		String currency13="brazillian real";
		String currency14="danish krone";
		String currency15="bulgarain lev";
		String currency16="phillippine peso";
		String currency17="swedish krona ";
		String currency18="turkish lira";
		String currency19="indonasia rupiah";
		String currency20="thai bhat";
		String currency21="omani rial";
		String currency22="sol";
		String currency23="brunei dollar";
		String currency24="chilean peso";
		String currency25="croatian kuna";
		String currency26="peso";
		
		Collection<String> collection=new TreeSet();
		collection.add(currency1);
		collection.add(currency2);
		collection.add(currency3);
		collection.add(currency4);
		collection.add(currency5);
		collection.add(currency6);
		collection.add(currency7);
		collection.add(currency8);
		collection.add(currency9);
		collection.add(currency10);
		collection.add(currency11);
		collection.add(currency12);
		collection.add(currency13);
		collection.add(currency14);
		collection.add(currency15);
		collection.add(currency16);
		collection.add(currency17);
		collection.add(currency18);
		collection.add(currency19);
		collection.add(currency20);
		collection.add(currency21);
		collection.add(currency22);
		collection.add(currency23);
		collection.add(currency24);
		collection.add(currency25);
		collection.add(currency26);
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
		
	}

	

}
