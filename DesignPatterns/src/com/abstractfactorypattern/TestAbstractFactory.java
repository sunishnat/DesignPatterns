package com.abstractfactorypattern;

public class TestAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory processorFactory = AbstractFactory.getFactory("Processor");
		MotherBoard intelProcessor = processorFactory.getProcessor("Intel");
		intelProcessor.getProcessorBrand();
		MotherBoard amdProcessor = processorFactory.getProcessor("AMD");
		amdProcessor.getProcessorBrand();
		
		AbstractFactory ramFactory = AbstractFactory.getFactory("RAM");
		RAM ddr3ram = ramFactory.getRam("DDR3");
		ddr3ram.getRamType();
		RAM ddr4ram = ramFactory.getRam("DDR4");
		ddr4ram.getRamType();

	}

}
