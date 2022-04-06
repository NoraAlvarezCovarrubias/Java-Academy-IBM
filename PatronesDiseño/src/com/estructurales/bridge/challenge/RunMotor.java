package com.estructurales.bridge.challenge;

public class RunMotor {

	public static void main(String[] args) {
		Vehiculo fordDiesel = new Ford(new Diesel());
		fordDiesel.mostrarCaracteristicas();

		Vehiculo fordGasolina = new Ford(new Gasolina());
		fordGasolina.mostrarCaracteristicas();
	}

}
