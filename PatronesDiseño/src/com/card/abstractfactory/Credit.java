package com.card.abstractfactory;

public class Credit implements PaymentMethod {

	@Override
	public String doPayment() {
		
		return "Pago con Credito";
	}

}
