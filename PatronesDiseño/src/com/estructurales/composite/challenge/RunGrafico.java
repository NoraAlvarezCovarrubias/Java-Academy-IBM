package com.estructurales.composite.challenge;

public class RunGrafico {

	public static void main(String[] args) {
		Grafico circulo = new Circulo(5);
		Grafico cuadrado = new Cuadrado(8);
		Grafico triangulo = new Triangulo(4, 6);
		
		GrupoDeImagenes imagenes = new GrupoDeImagenes();
		imagenes.addGrafico(circulo);
		imagenes.addGrafico(cuadrado);
		imagenes.addGrafico(triangulo);
		
		imagenes.pintar();
	}

}
