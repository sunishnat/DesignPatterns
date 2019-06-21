package com.flyweightdesignpattern;

public class CommuteBike implements Bike {
	
	private String brand;
	private int capacity;
	private int price;
	private String model;

	public CommuteBike(String brand) {
		super();
		this.brand = brand;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public void createBike() {
		System.out.println("CommuteBike [brand=" + brand + ", capacity=" + capacity + ", price=" + price + ", model=" + model + "]");

	}

}
