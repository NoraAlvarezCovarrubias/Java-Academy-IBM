package com.estructurales.decorator.challenge;

public class LecheDecorator extends AdicionalesDecorator {

	public LecheDecorator(Cafe decoratedAditional) {
		super(decoratedAditional);
	}

	@Override
	public void descripcion() {
		decoratedAditional.descripcion();
		configLeche();
	}

	@Override
	public float precio() {
		return decoratedAditional.precio()+5;
	}
	
	public void configLeche() {
		System.out.println("LECHE ADICIONAL");
	}

}
