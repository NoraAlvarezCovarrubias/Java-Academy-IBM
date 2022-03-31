package com.card.factory;

public class RunFactory {

	public static void main(String[] args) {
		Payment paymentCard = PaymentFactory.buildPayment(TypePayment.CARD);
		paymentCard.doPayment();
		
		Payment paymentGoogle = PaymentFactory.buildPayment(TypePayment.GOOGLEPAYMENT);
		paymentGoogle.doPayment();

	}

}
