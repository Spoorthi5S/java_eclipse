package com.xworkz.copy.things.thingsName;

import com.xworkz.copy.things.FriendsGroup;

public class FriendsGroupRunner {

	public static void main(String[] args) {
		String[] name= {"Afreen","pooja","shwetha","arun","yashwanth","yama"};
		String[] favColor= {"purple","pink","orange","black","brown","blue"};
		String[] heightType= {"short","short","medium","long","long","long"};
		String[] gender= {"female","Female","female","male","male","male"};
		String[] weight= {"35kg","34kg","40kg","50kg","55kg","54kg"};
		String[] homeTown= {"hospet","bellary","sandur","banglore","tiptur","bagalkot"};
		
		FriendsGroup friendgroup=new FriendsGroup(6, true, name, favColor, heightType,
			gender, weight, homeTown, 22, false, 'x');
		friendgroup.display();
		}

	}
