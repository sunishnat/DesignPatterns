package com.abstractfactorypattern;

public class RamFactory extends AbstractFactory {

	@Override
	public MotherBoard getProcessor(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RAM getRam(String type) {

		if(type.equals("DDR3")){
			return new DDR3();
		}
		else if(type.equals("DDR4")){
			return new DDR4();
		}
		return null;
	}

}
