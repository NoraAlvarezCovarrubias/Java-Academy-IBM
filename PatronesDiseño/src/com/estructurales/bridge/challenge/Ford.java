package com.estructurales.bridge.challenge;

public class Ford extends Vehiculo {

	public Ford(IMotor imotor) {
		super(imotor);
	}

	@Override
	public void mostrarCaracteristicas() {
		imotor.consumirGasolina();
		imotor.inyectarCombustible(89.0);
		
	}

}
