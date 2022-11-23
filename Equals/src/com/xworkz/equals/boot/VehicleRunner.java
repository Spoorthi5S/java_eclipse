package com.xworkz.equals.boot;

import com.xworkz.equals.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.setAlloy(true);
		vehicle.setBrand("BajajAuto");
		vehicle.setColor("Orange");
		vehicle.setMaterial("Steel");
		vehicle.setMileage(46);
		vehicle.setName("KTM");
		vehicle.setNoOfWheels(2);
		vehicle.setSeatCapacity(2);
		vehicle.setTopSpeed(80);
		vehicle.setType("Duke");
		
		Vehicle vehicle1=new Vehicle("Nissan","car","Datsun",4,"Orange",19.55,"Steel",false,6,80);
		System.out.println(vehicle1);
		
		boolean same=vehicle.equals(vehicle1);
		System.out.println(same);
		if(vehicle.getBrand().equals(vehicle1.getBrand()))
		{
			System.out.println("vehicle is same..");
		}
		boolean same1=vehicle.equals(vehicle1);
		System.out.println(same1);
		if(vehicle.getColor().equals(vehicle1.getColor()))
		{
			System.out.println("vehicle is same");
		}

	}

}
