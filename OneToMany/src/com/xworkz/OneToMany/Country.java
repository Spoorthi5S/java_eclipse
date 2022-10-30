package com.xworkz.OneToMany;

public class Country {
	public String name;
	public City[] cities;
	public President president;
	
	public Country(String name) {
		this.name = name;
	}
	
	public void setCites(City[] cities) {
		this.cities=cities;
	}
	
	public void setPresident(President president) {
		this.president=president;
	}
	
	public void display()
	{
		System.out.println("displaying country");
		System.out.println(this.name);
		if(this.cities !=null && this.cities.length>0) { 
		for(int i=0;i<this.cities.length;i++) {
			City element = this.cities[i];
			System.out.println(element);
			if(element != null) {
				element.display();
			} else {
				System.out.println("City is null in index"+i);
			}
			}
		} else {
			System.out.println("City is null or empty");
		
		}
	
	
	if(this.president !=null) {
		this.president.showOff();
	}else {
		System.out.println("president is null");
	}
}

	

	
	

	

}
