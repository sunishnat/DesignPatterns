package com.observerdesignpattern;

public class OctalObserver extends Observer {

	public OctalObserver(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update() {
		System.out.println("Octal: " + Integer.toOctalString(observable.getState()));

	}

}
