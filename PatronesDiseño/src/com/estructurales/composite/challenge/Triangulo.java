package com.estructurales.composite.challenge;

public class Triangulo implements Grafico {
	
	private float base;
	private float altura;
	
	

	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}


	@Override
	public void pintar() {
		float area = (base*altura)/2;
		System.out.println("El area del triangulo es: " + area);

	}

}
