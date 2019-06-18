package com.singletondesignpattern;

public class TestSingleton {

	public static void main(String[] args) {

		User user1 = User.getUser();
		User user2 = User.getUser();
		
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());

	}

}
