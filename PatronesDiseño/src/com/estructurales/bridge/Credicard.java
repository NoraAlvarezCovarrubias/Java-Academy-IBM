package com.estructurales.bridge;

public abstract class Credicard {
	
	protected ICreditCard card;

	public Credicard(ICreditCard card) {
		this.card = card;
	}
	
	public abstract void realizarPago();
	
}
