package com.xworkz.copy.Inheritane.boot;

import com.xworkz.copy.Inheritane.task.Cardiologist;
import com.xworkz.copy.Inheritane.task.Dentist;
import com.xworkz.copy.Inheritane.task.Doctor;
import com.xworkz.copy.Inheritane.task.ENT;

public class DoctorRunner {

	public static void main(String[] args) {
		
		Doctor doctor= new Doctor();
		System.out.println("starting of doctor");
		System.out.println(doctor.income);
		System.out.println(doctor.name);
		
		
		Doctor doctor1 =new Dentist();
		Dentist dentist=(Dentist) doctor1;
		System.out.println("starting of dentist");
		System.out.println(dentist.availableHours);
		System.out.println(dentist.fees);
		System.out.println(dentist.income);
		System.out.println(dentist.name);
		
		
		Doctor doctor2=new ENT();
		ENT ent=(ENT) doctor2;
		System.out.println("starting of ENT");
		System.out.println(ent.income);
		System.out.println(ent.name);
		System.out.println(ent.area);
		System.out.println(ent.fullForm);
		
		
		Doctor doctor3=new Cardiologist();
		Cardiologist cardiologist=(Cardiologist) doctor3;
		System.out.println("starting of cardiologist");
		System.out.println(cardiologist.income);
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.availbale);
		System.out.println(cardiologist.experiance);
		System.out.println("end of doctor");

	}

}
