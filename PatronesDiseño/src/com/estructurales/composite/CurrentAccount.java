package com.estructurales.composite;

public class CurrentAccount implements AccountComponent {

	private Double amount;
	private String name;
	
	public CurrentAccount(Double amount, String name) {
		this.amount = amount;
		this.name = name;
	}

	@Override
	public void showAccountName() {
		System.out.println("CurrentAccount: "+name);

	}

	@Override
	public Double getAmount() {
		return this.amount;
	}

}
