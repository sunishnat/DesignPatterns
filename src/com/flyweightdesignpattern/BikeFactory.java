package com.flyweightdesignpattern;

import java.util.HashMap;

public class BikeFactory {
	
	private static HashMap<String, Bike> bikeMap = new HashMap<>();
	
	public static Bike getBike(String brand){
		Bike bike = bikeMap.get(brand);
		
		if(bike == null){
			bike = new CommuteBike(brand);
			bikeMap.put(brand, bike);
			System.out.println("Creating bike of brand " + brand);
		}
		
		return bike;
	}

}
