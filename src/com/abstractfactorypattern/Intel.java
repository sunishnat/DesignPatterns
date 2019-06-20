package com.abstractfactorypattern;

public class Intel implements MotherBoard {

	@Override
	public void getProcessorBrand() {
		System.out.println("Intel");

	}

}
