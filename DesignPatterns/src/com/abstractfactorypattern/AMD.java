package com.abstractfactorypattern;

public class AMD implements MotherBoard {

	@Override
	public void getProcessorBrand() {
		System.out.println("AMD");

	}

}
