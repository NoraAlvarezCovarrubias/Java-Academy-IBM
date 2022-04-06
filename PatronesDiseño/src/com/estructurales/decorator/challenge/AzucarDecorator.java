package com.estructurales.decorator.challenge;

public class AzucarDecorator extends AdicionalesDecorator {

	public AzucarDecorator(Cafe decoratedAditional) {
		super(decoratedAditional);
	}

	@Override
	public void descripcion() {
		decoratedAditional.descripcion();
		configAzucar();
	}

	@Override
	public float precio() {
		return decoratedAditional.precio()+5;
	}
	
	public void configAzucar() {
		System.out.println("AZUCAR ADICIONAL");
	}

}
