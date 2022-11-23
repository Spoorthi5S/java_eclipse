package com.xworkz.equals.boot;

import com.xworkz.equals.Currency;

public class CurrencyRunner {

	public static void main(String[] args) {
		Currency currenacy = new Currency("Rupai", 5000, "RBI", "light yellow", true, "Ranganath", 1995,
				"Mumbai", 79845, true);

		System.out.println(currenacy);

		Currency currenacy2 = new Currency("Rupai", 563400, "RBI", "light yellow", true, "Suresh", 2000, "Mumbai",
				885667, true);
		System.out.println(currenacy2);

		boolean currenace = currenacy.equals(currenacy2);
		System.out.println(currenace);

	}

}
