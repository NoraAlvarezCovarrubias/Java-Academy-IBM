package com.car.factory;

public class RunCar {

	public static void main(String[] args) {
		SizeCar sizeSmall= CarFactory.buildCar(CarType.SMALL);
		sizeSmall.getSizeCar();
		
		SizeCar sizeLuxury= CarFactory.buildCar(CarType.LUXURY);
		sizeLuxury.getSizeCar();
		
		SizeCar sizeSedan= CarFactory.buildCar(CarType.SEDAN);
		sizeSedan.getSizeCar();

	}

}
