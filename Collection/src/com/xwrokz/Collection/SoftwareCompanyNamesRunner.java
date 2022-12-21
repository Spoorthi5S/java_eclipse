package com.xwrokz.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyNamesRunner {

	public static void main(String[] args) {
		String company1="Microsoft";
		String company2="Oracle";
		String company3="Ibm";
		String company4="Salesforce";
		String company5="Sap";
		String company6="Autodesk";
		String company7="Intuit";
		String company8="Splunk";
		String company9="SageSolutions";
		String company10="Dell";
		String company11="Twilio";
		String company12="Adp";
		String company13="Xero";
		String company14="InfosysTechnologies";
		String company15="DxcTechnology";
		String company16="Google";
		String company17="HCLTechnologies";
		String company18="FristAmerican";
		String company19="Cisco";
		String company20="IPEGSolutions";
		
		Collection<String> companies =new ArrayList<String>();
		companies.add(company20);
		companies.add(company19);
		companies.add(company18);
		companies.add(company17);
		companies.add(company16);
		companies.add(company15);
		companies.add(company14);
		companies.add(company13);
		companies.add(company12);
		companies.add(company11);
		companies.add(company10);
		companies.add(company9);
		companies.add(company8);
		companies.add(company7);
		companies.add(company6);
		companies.add(company5);
		companies.add(company4);
		companies.add(company2);
		companies.add(company3);
		companies.add(company1);
		
		for(String element:companies) {
			System.out.println(element);
		}
		
		System.out.println("---------------Iterator----------------------");
		
		Iterator<String> ref=companies.iterator();
		while(ref.hasNext()) {
			String element=ref.next();
			System.out.println(element);
		}

	}

}
