package com.card.prototype;

public class RunPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrototypeFactory.loadCard();
		
		try {
			PrototypeCard visa = PrototypeFactory.getInstance(PrototypeFactory.CardType.VISA);
			visa.getCard();
			
			PrototypeCard amex = PrototypeFactory.getInstance(PrototypeFactory.CardType.AMEX);
			amex.getCard();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
