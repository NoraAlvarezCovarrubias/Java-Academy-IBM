package com.estructurales.decorator.challenge;

public class CremaDecorator extends AdicionalesDecorator {

	public CremaDecorator(Cafe decoratedAditional) {
		super(decoratedAditional);
	}

	@Override
	public void descripcion() {
		decoratedAditional.descripcion();
		configCrema();
	}

	@Override
	public float precio() {
		return decoratedAditional.precio()+5;
	}
	
	public void configCrema() {
		System.out.println("CREMA ADICIONAL");
	}

}
