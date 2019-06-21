package com.facadedesignpattern;

public class EmployeeCreator {
	
	private Employee techEmployee;
	private Employee businessEmployee;
	private Employee adminEmployee;
	
	public EmployeeCreator() {
		techEmployee = new TechEmployee();
		businessEmployee = new BusinessEmployee();
		adminEmployee = new AdminEmployee();
	}
	
	public void onboardTechEmployee(){
		techEmployee.onboardEmployee();
	}
	
	public void onboardBusinessEmployee(){
		businessEmployee.onboardEmployee();
	}
	
	public void onboardAdminEmployee(){
		adminEmployee.onboardEmployee();
	}

}
