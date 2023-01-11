package com.xworkz.autowire.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowire")
public class AutowireConfiguration {

	public AutowireConfiguration() {
		System.out.println("Created AutowireConfiguration no-args const by spring..");
	}

	@Bean
	public int number() {
		System.out.println("Registering number by spring..");
		return 9;
	}

	@Bean
	public String title() {
		System.out.println("Registering title by spring..");
		String refOfTitle = new String("Rani Hardware");
		return refOfTitle;
	}

	@Bean
	public String gstnumber() {
		System.out.println("Registering gstnumber by spring..");
		String refOfGstNumber = new String("GSTIN4376");
		return refOfGstNumber;
	}

	@Bean
	public String owner() {
		System.out.println("Registering owner by spring..");
		String refOfOwner = new String("KrishnaVeni");
		return refOfOwner;
	}

	@Bean
	public String situated() {
		System.out.println("Registegring situated by spring..");
		String refOfSituated = new String("rajajinagar");
		return refOfSituated;
	}

	@Bean
	public String names() {
		System.out.println("Registering names by spring..");
		String refOfNames = new String("Java");
		return refOfNames;
	}

	@Bean
	public int date() {
		System.out.println("Registering date by spring..");
		return 23;
	}

	@Bean
	public Double softwareVersion() {
		System.out.println("Registering version by spring..");
		return 1.8;
	}

	@Bean
	public String DeveloperName() {
		System.out.println("Registering developer_name by spring..");
		String refOfDevName = new String("JamesGoslings");
		return refOfDevName;
	}

	@Bean
	public Boolean freeSource() {
		System.out.println("Registering free by spring..");
		return true;
	}

	@Bean
	public String engineerName() {
		System.out.println("Registering engineerName by spring..");
		String refOfEng = new String("sujan");
		return refOfEng;
	}

	@Bean
	public long salaryEng() {
		System.out.println("Registering salary by spring");
		return 25000;
	}

	@Bean
	public String company() {
		System.out.println("Registering company by spring");
		String refOfCom = new String("tcs");
		return refOfCom;
	}

	@Bean
	public int experience() {
		System.out.println("Registering experience by spring..");
		return 5;
	}

	@Bean
	public String pencilName() {
		System.out.println("Registering pencilName by spring");
		String refOfPencil = new String("Doms");
		return refOfPencil;
	}

	@Bean
	public String pencilType() {
		System.out.println("Registering pencilType by spring");
		String refOfPencilType = new String("penPencil");
		return refOfPencilType;
	}

	@Bean
	public int price() {
		System.out.println("Registering price by spring");
		return 5;
	}

	@Bean
	public String pencilColor() {
		System.out.println("Registering pencilColor by spring");
		String refOfColor = new String("pink");
		return refOfColor;
	}

	@Bean
	public Boolean sharpPencil() {
		System.out.println("Registering sharp by spring");
		return true;
	}

	@Bean
	public Boolean notStolen() {
		System.out.println("Registering stolen by spring");
		return false;
	}

	@Bean
	public String rubberName() {
		System.out.println("Registering rubberName by spring");
		String refOfrubber = new String("apsara");
		return refOfrubber;
	}

	@Bean
	public String rubberType() {
		System.out.println("Registering rubberType by spring");
		String refOfRubberType = new String("withPencil");
		return refOfRubberType;
	}

	@Bean
	public int duddu() {
		System.out.println("Registering duddu by spring");
		return 3;
	}

	@Bean
	public String rubberColor() {
		System.out.println("Registering rubberColor by spring");
		String refOfRubColor = new String("white");
		return refOfRubColor;
	}

	@Bean
	public Boolean sharpRubber() {
		System.out.println("Registering sharpRubber by spring");
		return true;
	}

	@Bean
	public Boolean stolened() {
		System.out.println("Registering stolened by spring");
		return false;
	}

	@Bean
	public String small() {
		System.out.println("Registering small by spring");
		String refOfSmall = new String("domsRubber");
		return refOfSmall;
	}

	@Bean
	public String collegeName() {
		System.out.println("Registering collegeName by spring");
		String refOfCollege = new String("KalpataruInstituteOfTechnology");
		return refOfCollege;
	}

	@Bean
	public int branches() {
		System.out.println("Registering branches by spring");
		return 6;
	}

	@Bean
	public double fees() {
		System.out.println("registering fees by spring");
		return 70000;
	}

	@Bean
	public long branchStaff() {
		System.out.println("registering staff by spring");
		return 30;
	}

	@Bean
	public boolean inExam() {
		System.out.println("registering inExam by spring");
		return false;
	}

	@Bean
	public char section() {
		System.out.println("registering sec by spring");
		return 'B';
	}

	@Bean
	public float cgpa() {
		System.out.println("registering cgpa by spring");
		return 8.4f;
	}

	@Bean
	public short student() {
		System.out.println("registering student by spring");
		return 84;
	}

	@Bean
	public byte officeStaff() {
		System.out.println("registering office by spring..");
		return 51;
	}

}
