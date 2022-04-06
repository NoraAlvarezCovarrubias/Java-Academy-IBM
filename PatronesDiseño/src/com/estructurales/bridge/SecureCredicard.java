package com.estructurales.bridge;

public class SecureCredicard implements ICreditCard {

	@Override
	public void realizarPago() {
		System.out.println("Pago realizado con seguridad");

	}

}
