package com.facadedesignpattern;

public class TestFacade {

	public static void main(String[] args) {

		EmployeeCreator creator = new EmployeeCreator();
		
		creator.onboardTechEmployee();
		creator.onboardBusinessEmployee();
		creator.onboardAdminEmployee();

	}

}
