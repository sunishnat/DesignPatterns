package com.abstractfactorypattern;

public class ProcessorFactory extends AbstractFactory {

	@Override
	public MotherBoard getProcessor(String brand) {

		if(brand.equals("Intel")){
			return new Intel();
		}
		else if(brand.equals("AMD")){
			return new AMD();
		}
		return null;
	}

	@Override
	public RAM getRam(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
