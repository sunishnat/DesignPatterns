package com.adapterdesignpattern;

public class WebApplicationDepartment implements TechnicalDepartment {

	@Override
	public void developWebApplication(String application) {
		System.out.println("Building web application for " + application);

	}

	@Override
	public void developMobileApplication(String application) {
		// TODO Auto-generated method stub

	}

}
