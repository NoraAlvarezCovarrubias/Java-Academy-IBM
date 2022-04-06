package com.estructurales.decorator;

public class InternationalPaymentDecorator extends CreditDecorator {

	public InternationalPaymentDecorator(Credit decoratedCredit) {
		super(decoratedCredit);
	}

	@Override
	public void showCredit() {
		decoratedCredit.showCredit();
		configInternational();
	}
	
	private void configInternational() {
		System.out.println("La tarjeta ha sido configurada para pagos internacionales");
	}

}
