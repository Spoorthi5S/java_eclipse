package com.xworkz.String;

public class StringMethods {

	public static void main(String[] args) {
		String ref1 = "LUCKY";
		System.out.println(ref1);
		System.out.println("==============================");
		ref1 = ref1 + " MAN";
		String ref2 = ref1.concat(",Hi");
		System.out.println(ref2);
		System.out.println("-----------------------------");

		char ref3 = ref1.charAt(1);
		System.out.println(ref3);
		System.out.println("***********************");

		int ref4 = ref1.codePointAt(1);
		System.out.println(ref4);
		System.out.println("//////////////////////////");

		int ref5 = ref1.codePointBefore(1);
		System.out.println(ref5);
		System.out.println("===========================");

		int ref6 = ref1.codePointCount(1, 4);
		System.out.println(ref6);
		System.out.println("--------------------------");

		int ref7 = ref2.compareTo(ref1);
		System.out.println(ref7);
		System.out.println("*********************");

		boolean ref8 = ref1.contains("LU");
		System.out.println(ref8);
		System.out.println("=========================");

		boolean ref9 = ref1.contentEquals("LUCKY MAN");
		System.out.println(ref9);
		System.out.println("------------------------");

		boolean ref10 = ref1.endsWith("N");
		System.out.println(ref10);
		System.out.println("*********************");

		int ref11 = ref1.hashCode();
		System.out.println(ref11);
		System.out.println("=======================");

		int ref12 = ref1.indexOf(2);
		System.out.println(ref12);
		System.out.println("-----------------------");

		String ref13 = ref1.intern();
		System.out.println(ref13);
		System.out.println("========================");

		boolean ref14 = ref1.isEmpty();
		System.out.println(ref14);
		System.out.println("*************************");

		int ref15 = ref1.lastIndexOf(2);
		System.out.println(ref15);
		System.out.println("=========================");

		boolean ref16 = ref1.matches("LUCKY MAN");
		System.out.println(ref16);
		System.out.println("-------------------------");

		String ref17 = ref1.replace('L', 'C');
		System.out.println(ref17);
		System.out.println("*************************");

		int ref18 = ref1.length();
		System.out.println(ref18);
		System.out.println("========================");

		String ref19 = ref1.replace("MAN", "WOMEN");
		System.out.println(ref19);
		System.out.println("---------------------------");

		String ref20 = ref1.replaceAll("LUCKY", "HI");
		System.out.println(ref20);
		System.out.println("***********************");

		boolean ref21 = ref1.startsWith("LU");
		System.out.println(ref21);
		System.out.println("==========================");

		boolean ref22 = ref1.startsWith("LUCKY", 0);
		System.out.println(ref22);
		System.out.println("---------------------------");

		char[] ref23 = ref1.toCharArray();
		System.out.println(ref23);
		System.out.println("***************************");

		String ref24 = ref1.toLowerCase();
		System.out.println(ref24);
		System.out.println("===============================");

		String ref25 = ref24.toUpperCase();
		System.out.println("------------------------------");
	}

	}


