package com.adapterdesignpattern;

public class MobileApplicationDepartment implements TechnicalDepartment {

	@Override
	public void developWebApplication(String application) {
		// TODO Auto-generated method stub

	}

	@Override
	public void developMobileApplication(String application) {
		System.out.println("Building mobile application for " + application);

	}

}
