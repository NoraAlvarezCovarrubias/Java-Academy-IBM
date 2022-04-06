package com.estructurales.composite.challenge;

public class Cuadrado implements Grafico {
	
	private float lado;

	public Cuadrado(float lado) {
		this.lado = lado;
	}

	@Override
	public void pintar() {
		float area = (float) Math.pow(lado,4);
		System.out.println("El area del cuadrado es: " + area);

	}

}
