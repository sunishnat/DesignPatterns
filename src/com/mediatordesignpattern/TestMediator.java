package com.mediatordesignpattern;

public class TestMediator {

	public static void main(String[] args) {

		Employee charles = new Employee("Charles");
		Employee eric = new Employee("Eric");
		
		charles.sendMessage("Hello Eric");
		eric.sendMessage("Hi Charles, long time!!");

	}

}
