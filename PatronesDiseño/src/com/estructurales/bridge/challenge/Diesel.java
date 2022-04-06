package com.estructurales.bridge.challenge;

public class Diesel implements IMotor {

	@Override
	public void inyectarCombustible(Double iny) {
		System.out.println("Inyeccion de Diesel: " + (iny+5));

	}

	@Override
	public void consumirGasolina() {
		System.out.println("Rinde 16 km/lt");

	}

}
