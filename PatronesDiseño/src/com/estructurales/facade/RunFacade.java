package com.estructurales.facade;

public class RunFacade {

	public static void main(String[] args) {
		CreditMaker creditMaker= new CreditMaker();
		
		creditMaker.showCreditGold();
		creditMaker.showCreditSilver();
		creditMaker.showCreditBlack();

	}

}
