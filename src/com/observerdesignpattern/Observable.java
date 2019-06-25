package com.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	
	private List<Observer> observers = new ArrayList<>();
	private int state;

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	public void notifyAllObservers() {
		for(Observer observer : observers){
			observer.update();
		}
		
	}
	

}
