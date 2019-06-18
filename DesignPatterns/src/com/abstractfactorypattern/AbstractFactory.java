package com.abstractfactorypattern;

public abstract class AbstractFactory {
	
	public static AbstractFactory getFactory(String part){
		AbstractFactory factory = null;
		
		if(part.equals("Processor")){
			factory = new ProcessorFactory();
		}
		else if(part.equals("RAM")){
			factory = new RamFactory();
		}
		
		return factory;
	}
	
	public abstract MotherBoard getProcessor(String brand);
	public abstract RAM getRam(String type);

}
