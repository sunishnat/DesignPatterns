package com.observerdesignpattern;

public class TestObserver {

	public static void main(String[] args) {
		Observable observable = new Observable();
		
		new BinaryObserver(observable);
		new OctalObserver(observable);
		new HexObserver(observable);
		
		System.out.println("State 1: 10");
		observable.setState(10);
		System.out.println("State 2: 15");
		observable.setState(15);
		System.out.println("State 3: 20");
		observable.setState(20);

	}

}
