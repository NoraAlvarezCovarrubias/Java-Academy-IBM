package com.estructurales.decorator.challenge;

public class RunCafe {

	public static void main(String[] args) {
		Cafe cafeNormal= new Normal(); //Precio = 15
		cafeNormal.descripcion();
		System.out.println("Total a pagar: " + cafeNormal.precio());
		
		Cafe cafeNormalConLeche = new Normal();
		cafeNormalConLeche = new LecheDecorator(cafeNormalConLeche);
		cafeNormalConLeche.descripcion();
		System.out.println("Total a pagar: " + cafeNormalConLeche.precio());
		
		Cafe cafeNormalConLecheYAzucar = new Normal();
		cafeNormalConLecheYAzucar = new LecheDecorator(cafeNormalConLecheYAzucar);
		cafeNormalConLecheYAzucar = new AzucarDecorator(cafeNormalConLecheYAzucar);
		cafeNormalConLecheYAzucar.descripcion();
		System.out.println("Total a pagar: " + cafeNormalConLecheYAzucar.precio());
		
		System.out.println("****************************************************");
		
		Cafe cafeDescafeinado = new Descafeinado();
		cafeDescafeinado.descripcion();
		System.out.println("Total a pagar: " + cafeDescafeinado.precio());
		
		Cafe cafeDescafeinadoConAzucar = new Descafeinado();
		cafeDescafeinadoConAzucar = new AzucarDecorator(cafeDescafeinadoConAzucar);
		cafeDescafeinadoConAzucar.descripcion();
		System.out.println("Total a pagar: " + cafeDescafeinadoConAzucar.precio());
		
		Cafe cafeDescafeinadoConAzucarYCrema = new Descafeinado();
		cafeDescafeinadoConAzucarYCrema = new AzucarDecorator(cafeDescafeinadoConAzucarYCrema);
		cafeDescafeinadoConAzucarYCrema = new CremaDecorator(cafeDescafeinadoConAzucarYCrema);
		cafeDescafeinadoConAzucarYCrema.descripcion();
		System.out.println("Total a pagar: " + cafeDescafeinadoConAzucarYCrema.precio());
	}

}
