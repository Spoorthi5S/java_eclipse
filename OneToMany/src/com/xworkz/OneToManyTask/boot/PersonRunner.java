package com.xworkz.OneToManyTask.boot;

import com.xworkz.OneToManyTask.*;

public class PersonRunner {

	public static void main(String[] args) {
		Person person=new Person("Spoorthi");
		Email email1=new Email("spoorthi@gmail.com", "spoorthi1234", 7892647108d);
		Job job=new Job(25000d, "softwareDeveloper", true);
		Company company=new Company("xworkz", "omkar");
		Address address=new Address();
		Location location=new Location(12,"basavangudi");
		States state=new States("Karnataka",27, "bommai", "ITCompanies");
		City city=new City("Banglore", false, 10, 5000d);
		Country country=new Country("INDIA", 21, "+91", false);
		Email email2=new Email("Varsha@gmail.com", "1234567@v", 9900877654d);
		email2.setCompany(company);
		Email email3=new Email("Sujan@gmail.com", "sujanhunter3", 7483549342d);
		email3.setCompany(company);
		Email[] strong = {email1,email2,email3};
		person.setEmail(strong);
		person.showOff();
		job.showOff();
		address.showOff();
		location.showOff();
		state.showOff();
		city.showOff();
		country.showOff();
		
		
		
		

	}

}
