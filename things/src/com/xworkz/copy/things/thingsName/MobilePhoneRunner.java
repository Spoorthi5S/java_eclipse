package com.xworkz.copy.things.thingsName;

import com.xworkz.copy.things.MobilePhone;

public class MobilePhoneRunner {

	public static void main(String[] args) {
		String[] MobileType= {"screenTouch","keypad"};
		String[] brand= {"vivo","realme","redme","samsung","iphone"};
		String[] features= {"48MPCamera","5gbRam","128GbStorage"};
		String[] backCover= {"TransparentSilicone","PlasticCase","HybridBackCase","RubberCover","FlipCase"};
		String[] keypadMobileBrand= {"SamsungGuruE1200","Nokia5710","DizoStar500","lavaFlip"};
		String[] color= {"blue","black","silver"};
		
		MobilePhone mobilephone=new MobilePhone(MobileType, 4, brand, features, false, true, backCover, false, keypadMobileBrand, 1200, color);
		mobilephone.display();

	}

}
