package com.card.abstractfactory;

public class MasterCard implements Card {

	@Override
	public String getCardNumber() {
		
		return "777 888 999";
	}

	@Override
	public String getCardType() {
		
		return "MASTERCARD";
	}

}
