package com.xworkz.copy.things.thingsName;

import com.xworkz.copy.things.UnoCards;

public class UnoCardsRunner {

	public static void main(String[] args) {
		
		String[] color= {"yellow","red","green","blue"};
		String[] cardTypeInOneColor= {"redNumbers","redSpecialCards","redReverse","redSkip","redPlusTwo"};
		String[] cardsName= {"Reverse","Skip","number","plusTwo,"};
		String[] SpecialCardPresent= {"colorChange","plusFour","plusTwo","reverse","skip"};
		String[] specialType= {"RedPlusTwo","YellowPlusTwo","GreenPlusTwo","bluePlusTwo","blackPlusFour"};
		
		UnoCards unocard=new UnoCards(color,52,5,2,true,cardTypeInOneColor,cardsName,false,SpecialCardPresent,specialType,true);
		unocard.display();

	}

}
