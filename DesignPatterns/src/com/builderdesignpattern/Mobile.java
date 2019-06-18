package com.builderdesignpattern;

public abstract class Mobile implements Gadget{

	@Override
	public Processor getProcessor() {
		
		return new Snapdragon();
	}

	@Override
	public abstract int getPrice();

}
