package com.estructurales.decorator.challenge;

public class Descafeinado implements Cafe {

	@Override
	public void descripcion() {
		System.out.println("-----Cafe Descafeinado-----");

	}

	@Override
	public float precio() {
		return 25;
	}

}
