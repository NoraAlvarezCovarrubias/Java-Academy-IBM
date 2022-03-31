package com.card.abstractfactory;

public class Visa implements Card {

	@Override
	public String getCardNumber() {
		
		return "444 555 666";
	}

	@Override
	public String getCardType() {
		
		return "VISA";
	}

}
