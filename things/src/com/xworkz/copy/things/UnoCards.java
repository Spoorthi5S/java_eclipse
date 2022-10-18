package com.xworkz.copy.things;

public class UnoCards {
	public String[] color;
	public int quantity;
	public int colorType;
	public int cardTypes;
	public boolean manyPeople;
	public String[] cardTypeInOneColor;
	public String[] cardsName;
	public boolean specialCard;
	public String[] specialCardPresent;
	public String[] specialType;
	public boolean plusTwoCards;
	
	public UnoCards(String[] color,int quantity,int colorType,int cardTypes,boolean manyPeople,String[] cardTypeInOneColor,String[] cardsName,boolean specialCard,String[] specialCardPresent,String[] specialType,boolean plusTwoCards) {
	this.color=color;
	this.quantity=quantity;
	this.colorType=colorType;
	this.cardTypes=cardTypes;
	this.manyPeople=manyPeople;
	this.cardTypeInOneColor=cardTypeInOneColor;
	this.cardsName=cardsName;
	this.specialCardPresent=specialCardPresent;
	this.specialCard=specialCard;
	this.specialType=specialType;
	this.plusTwoCards=plusTwoCards;
	System.out.println("UnoCards with 11arguments...");
	
	

}
	public void display()
	{
		System.out.println("====================================");
		for (int i = 0; i < cardTypeInOneColor.length; i++) {
			String string = cardTypeInOneColor[i];
			System.out.println(string);
		}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < cardsName.length; i++) {
			String string = cardsName[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < specialCardPresent.length; i++) {
			String string = specialCardPresent[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < specialType.length; i++) {
			String string = specialType[i];
			System.out.println(string);
		}
		System.out.println(this.quantity);
		System.out.println(this.colorType);
		System.out.println(this.cardTypes);
		System.out.println(this.manyPeople);
		System.out.println(this.specialCard);
		System.out.println(this.plusTwoCards);
		
	}
}