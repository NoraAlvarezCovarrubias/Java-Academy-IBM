package com.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public class AccountComposite implements AccountComponent {

	private List<AccountComponent> childAccount;
	
	public AccountComposite() {
		this.childAccount = new ArrayList<>();
	}
	
	@Override
	public void showAccountName() {
		for(AccountComponent account : this.childAccount) {
			account.showAccountName();
		}
		
	}

	@Override
	public Double getAmount() {
		Double totalAmount = 0.0;
		for(AccountComponent account : this.childAccount) {
			totalAmount += account.getAmount();
		}
		System.out.println("La cantidad de dinero es: " + totalAmount);
		return totalAmount;
	}
	
	public void addAmount(AccountComponent account) {
		this.childAccount.add(account);
	}
	
	public void removeAmount(AccountComponent account) {
		this.childAccount.remove(account);
	}

}
