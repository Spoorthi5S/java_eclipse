package com.xworkz.OneToMany.boot;

import com.xworkz.OneToMany.City;
import com.xworkz.OneToMany.Country;
import com.xworkz.OneToMany.Gender;
import com.xworkz.OneToMany.Name;
import com.xworkz.OneToMany.President;

public class CountryRunner {

	public static void main(String[] args) {
		Country country=new Country("Zimbabwe");
		President president = new President("Emmerson Mnangagwa");
		
		president.setGender(Gender.MALE);
		country.setPresident(president);
		
		Name name = new Name("Harare","Salisbury",null);
		City city = new City(name);
		city.setAreaInSquareKilometers(345);
		
		Name name2 = new Name("Bulawayo",null,null);
		City city2 = new City(name2);
		
		City[] cities = {city, city2};
		
		country.setCites(cities);
		
		country.display();
		

	}

}
