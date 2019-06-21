package com.flyweightdesignpattern;

public class TestFlyweight {
	
	public static String brands[] = { "Honda", "Suzuki", "Bajaj", "Yamaha", "Enfield", "Hero" };

	public static void main(String[] args) {

		for(int i=1; i<=20; i++){
			CommuteBike bike = (CommuteBike) BikeFactory.getBike(getRandomBrand());
			bike.setCapacity(i*100);
			bike.setPrice(i*10000);
			bike.setModel("Model-" + i);
			bike.createBike();
		}

	}

	public static String getRandomBrand() {
		return brands[(int) (Math.random()*brands.length)];
	}

}
