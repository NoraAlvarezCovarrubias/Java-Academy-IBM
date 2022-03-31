package com.card.abstractfactory;

public class ProviderFactory {

	public static AbstractFactory getFactory(String chooseFactory) {
		if("Card".equals(chooseFactory)) {
			return new CardFactory();
		}else if("PaymentMethod".equals(chooseFactory)) {
			return new PaymentMethodFactory();
		}
		return null;
	}
}
