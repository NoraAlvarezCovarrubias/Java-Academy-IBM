package com.estructurales.composite;

public class RunComposite {

	public static void main(String[] args) {
		AccountComponent currentAccount= new CurrentAccount(1000.00, "Nora");
		AccountComponent savingAccount= new SavingAccount(20000.00, "Nora");
		
		AccountComposite accountComposite = new AccountComposite();
		accountComposite.addAmount(currentAccount);
		accountComposite.addAmount(savingAccount);
		
		accountComposite.showAccountName();
		accountComposite.getAmount();

	}

}
