package com.decoratordesignpattern;

public class DecalsCar extends CarDecorator {

	public DecalsCar(Car decoratedCar) {
		super(decoratedCar);
	}
	
	public void getCar(){
		decoratedCar.getCar();
		drawDecals(decoratedCar);
	}

	private void drawDecals(Car decoratedCar) {
		System.out.println("Decals painted");
		
	}

}
