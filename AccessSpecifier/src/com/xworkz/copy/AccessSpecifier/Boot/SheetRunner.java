package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.*;

public class SheetRunner {

	public static void main(String[] args) {
		Sheet sheet=new Sheet();
		BedSheet bedsheet=new BedSheet("cotton", "blue", false, false, "rug", 'l', 6, 4.5f, "ancient", true, 459.9d);
		sheet.useSheet(bedsheet);
		System.out.println(bedsheet.getColor());

	}

}
