package com.decoratordesignpattern;

public class TestDecorator {

	public static void main(String[] args) {

		Car audi = new Audi();
		audi.getCar();
		
		Car audiDecals = new DecalsCar(new Audi());
		audiDecals.getCar();
		
		Car bmwDecals = new DecalsCar(new BMW());
		bmwDecals.getCar();

	}

}
