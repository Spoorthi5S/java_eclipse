package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.*;

public class FaceWashCompanyRunner {

	public static void main(String[] args) {
		FaceWash himalaya = new FaceWash();
		System.out.println(himalaya.getProductName());
		System.out.println(himalaya.getManufacturingBy());
		System.out.println(himalaya.getModelName());
		System.out.println(himalaya.getQuantity());
		System.out.println(himalaya.getPrice());
		System.out.println(himalaya.getFaceWashType());
		System.out.println(himalaya.getIngredientType());
		System.out.println(himalaya.getMaximumShelfLife());
		System.out.println(himalaya.getAppliedFor());
		System.out.println(himalaya.getSkinType());
		System.out.println(himalaya.getContainerType());
		
		FaceWashCompany himalayaModify = new FaceWashCompany();
		himalayaModify.modifyingHimalaya(himalaya);
		System.out.println(himalaya);
	}

	}


