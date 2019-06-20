package com.builderdesignpattern;

public abstract class Laptop implements Gadget{

	@Override
	public Processor getProcessor() {
		
		return new Intel();
	}

	@Override
	public abstract int getPrice();

}
