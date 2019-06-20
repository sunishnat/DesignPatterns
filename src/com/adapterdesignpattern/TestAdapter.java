package com.adapterdesignpattern;

public class TestAdapter {

	public static void main(String[] args) {
		DesignLab lab = new DesignLab();
		
		lab.buildDesign("ABC", "design");
		lab.buildDesign("DEF", "webapplication");
		lab.buildDesign("GHI", "mobileapplication");
		lab.buildDesign("JKL", "testing");

	}

}
