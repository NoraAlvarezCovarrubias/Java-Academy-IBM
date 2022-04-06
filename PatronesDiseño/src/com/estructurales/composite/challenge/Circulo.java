package com.estructurales.composite.challenge;

public class Circulo implements Grafico {

	private float radio;

	public Circulo(float radio) {
		this.radio = radio;
	}



	@Override
	public void pintar() {
		float area= (float) (Math.PI * Math.pow(radio,2));
		System.out.println("El area del circulo es: " + area);

	}

}
