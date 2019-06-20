package com.factorydesignpattern;

public class TestFactory {

	public static void main(String[] args) {

		CarFactory factory = new CarFactory();
		
		Car car = factory.getCar("Mercedes");
		car.start();
		
		car = factory.getCar("BMW");
		car.start();
		
		car = factory.getCar("Ferrari");
		car.start();
		
		car = factory.getCar("Audi");
		car.start();

	}

}
