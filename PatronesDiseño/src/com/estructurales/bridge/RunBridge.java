package com.estructurales.bridge;

public class RunBridge {

	public static void main(String[] args) {
		Credicard classic = new ClassicCreditCard(new UnSecureCreditCard());
		classic.realizarPago();
		
		Credicard black = new ClassicCreditCard(new SecureCredicard());
		black.realizarPago();	

	}

}
