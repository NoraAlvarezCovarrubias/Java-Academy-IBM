package com.estructurales.decorator;

public class RunDecorator {
	
	public static void main(String[] args) {
		Credit gold = new Gold();
		Credit blackWithInternationalPayment= new Black();
		blackWithInternationalPayment = new InternationalPaymentDecorator(blackWithInternationalPayment);
		
		Credit goldWithSecureAndInternationalPayment = new Gold();
		goldWithSecureAndInternationalPayment = new SecureDecorator(goldWithSecureAndInternationalPayment);
		goldWithSecureAndInternationalPayment =  new InternationalPaymentDecorator(goldWithSecureAndInternationalPayment);
		
		System.out.println("------- Tarjeta gold sin configuracion-----");
		gold.showCredit();
		
		System.out.println("--------Tarjeta black con configuracion-----");
		blackWithInternationalPayment.showCredit();
		
		System.out.println("-------Tarjeta gold2 con configuracion------ ");
		goldWithSecureAndInternationalPayment.showCredit();
	}

}
