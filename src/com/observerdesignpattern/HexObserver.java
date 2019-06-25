package com.observerdesignpattern;

public class HexObserver extends Observer {

	public HexObserver(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hex: " + Integer.toHexString(observable.getState()));

	}

}
