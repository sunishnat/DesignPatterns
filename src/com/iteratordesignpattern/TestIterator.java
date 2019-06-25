package com.iteratordesignpattern;

public class TestIterator {

	public static void main(String[] args) {
		
		CarRepository repository = new CarRepository();
		Iterator iterator = repository.getIterator();
		while(iterator.hasNext()){
			System.out.println("Car: " + iterator.next());
		}

	}

}
