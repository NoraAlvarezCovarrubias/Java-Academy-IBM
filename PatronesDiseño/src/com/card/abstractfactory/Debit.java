package com.card.abstractfactory;

public class Debit implements PaymentMethod {

	@Override
	public String doPayment() {
		
		return "Pago con Debito";
	}

}
