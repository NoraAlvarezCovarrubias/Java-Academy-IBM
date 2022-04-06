package com.estructurales.bridge;

public class ClassicCreditCard extends Credicard {

	
	public ClassicCreditCard(ICreditCard card) {
		super(card);
	}

	@Override
	public void realizarPago() {
		card.realizarPago();

	}

}
