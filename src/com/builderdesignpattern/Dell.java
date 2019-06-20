package com.builderdesignpattern;

public class Dell extends Laptop{

	@Override
	public String getBrand() {
		
		return "Dell";
	}

	@Override
	public int getPrice() {
		
		return 35;
	}

}
