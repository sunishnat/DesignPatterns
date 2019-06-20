package com.prototypedesignpattern;

public class TestPrototype {

	public static void main(String[] args) {

		ProjectCache.loadCache();
		
		Project analyst = ProjectCache.getAssociate("analyst");
		Project developer = ProjectCache.getAssociate("developer");
		Project tester = ProjectCache.getAssociate("tester");
		Project support = ProjectCache.getAssociate("support");
		
		System.out.println(analyst.getAssociate() + ": ");
		analyst.getWork();
		System.out.println(developer.getAssociate() + ": ");
		developer.getWork();
		System.out.println(tester.getAssociate() + ": ");
		tester.getWork();
		System.out.println(support.getAssociate() + ": ");
		support.getWork();

	}

}
