package com.estructurales.decorator.challenge;

public class Normal implements Cafe {

	@Override
	public void descripcion() {
		System.out.println("-----Cafe Normal-----");

	}

	@Override
	public float precio() {
		return 15; 
	}

}
