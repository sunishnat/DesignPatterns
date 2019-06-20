package com.factorydesignpattern;

public class CarFactory {
	
	public Car getCar(String brand){
		
		if(brand.equals("Mercedes")){
			return new Mercedes();
		}
		else if(brand.equals("BMW")){
			return new BMW();
		}
		else if(brand.equals("Audi")){
			return new Audi();
		}
		else if(brand.equals("Ferrari")){
			return new Ferrari();
		}
		
		return null;
	}

}
