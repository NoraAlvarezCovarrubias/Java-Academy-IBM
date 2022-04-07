package com.estructurales.facade;

public class CreditMaker {

	private Credit gold;
	private Credit silver;
	private Credit black;
	
	public CreditMaker() {
		this.gold = new Gold();
		this.silver = new Silver();
		this.black = new Black();
	}
	
	public void showCreditGold() {
		this.gold.showCredit();
	}
	
	public void showCreditSilver() {
		this.silver.showCredit();
	}
	
	public void showCreditBlack() {
		this.black.showCredit();
	}
}
