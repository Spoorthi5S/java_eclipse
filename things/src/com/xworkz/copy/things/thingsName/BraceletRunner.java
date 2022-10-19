package com.xworkz.copy.things.thingsName;

import com.xworkz.copy.things.Bracelet;

public class BraceletRunner {

	public static void main(String[] args) {
		String[] type= {"tennis","pearl","charm","bangle"};
		String[] gender= {"female","male"};
		String[] pattern= {"round","ovul","box","plain"};
		String[] duplicateType= {"tread","friendshipBand"};
		String[] color= {"gold","silver","platinum","bronze"};
		
		Bracelet bracelet=new Bracelet(type, gender, pattern, true, false, duplicateType, color, 3, 22, true, 500);
		bracelet.display();

	}

}
