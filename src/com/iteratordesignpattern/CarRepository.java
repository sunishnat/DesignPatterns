package com.iteratordesignpattern;

public class CarRepository implements Garage {
	
	public String cars[] = {"Audi", "BMW", "Mercedes", "Ferrari", "Bugati", "Lamborghini", "Ford"};

	@Override
	public Iterator getIterator() {
		return new CarIterator();
	}
	
	private class CarIterator implements Iterator{
		
		int index;

		@Override
		public boolean hasNext() {
			if(index<cars.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
				return cars[index++];
			}
			return null;
		}
		
	}

}
