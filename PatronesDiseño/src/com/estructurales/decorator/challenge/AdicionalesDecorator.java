package com.estructurales.decorator.challenge;

public class AdicionalesDecorator implements Cafe {

	protected Cafe decoratedAditional;
	
	
	public AdicionalesDecorator(Cafe decoratedAditional) {
		this.decoratedAditional = decoratedAditional;
	}

	@Override
	public void descripcion() {
		this.decoratedAditional.descripcion();

	}

	@Override
	public float precio() {
		//float add = this.decoratedAditional.precio();
		return this.decoratedAditional.precio();
	}

}
