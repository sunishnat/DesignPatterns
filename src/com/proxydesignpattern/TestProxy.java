package com.proxydesignpattern;

public class TestProxy {

	public static void main(String[] args) {

		Employee employee = new ProxyEmployee(101);
		
		employee.getEmployee();
		System.out.println("----------------");
		
		employee.getEmployee();

	}

}
