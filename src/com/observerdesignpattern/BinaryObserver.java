package com.observerdesignpattern;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("Binary: " + Integer.toBinaryString(observable.getState()));

	}

}
