package com.mediatordesignpattern;

import java.util.Date;

public class GroupChat {
	
	public static void showMessage(Employee employee, String message){
		System.out.println(new Date().toString());
		System.out.println(employee.getName() + ":");
		System.out.println(message);
	}

}
