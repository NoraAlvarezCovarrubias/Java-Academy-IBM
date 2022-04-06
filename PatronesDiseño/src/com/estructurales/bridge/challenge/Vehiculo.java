package com.estructurales.bridge.challenge;

public abstract class Vehiculo {
	
	protected IMotor imotor;

	public Vehiculo(IMotor imotor) {
		this.imotor = imotor;
	}
	
	public abstract void mostrarCaracteristicas();

}
