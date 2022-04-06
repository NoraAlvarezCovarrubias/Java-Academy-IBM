package com.estructurales.bridge.challenge;

public class Gasolina implements IMotor {

	@Override
	public void inyectarCombustible(Double iny) {
		System.out.println("Inyeccion de Gasolina: " + (iny+8));
	}

	@Override
	public void consumirGasolina() {
		System.out.println("Rinde 18 km/lt");

	}

}
