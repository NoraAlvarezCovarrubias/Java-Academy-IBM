package com.estructurales.composite;

public class SavingAccount implements AccountComponent {

	private Double amount;
	private String name;
	
	public SavingAccount(Double amount, String name) {
		this.amount = amount;
		this.name = name;
	}
	
	@Override
	public void showAccountName() {
		System.out.println("SavingAccount: "+name);

	}

	@Override
	public Double getAmount() {
		return this.amount;
	}

}
