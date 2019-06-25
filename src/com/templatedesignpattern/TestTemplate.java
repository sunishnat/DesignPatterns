package com.templatedesignpattern;

public class TestTemplate {

	public static void main(String[] args) {
		DataFile file = new CollectionFile();
		file.getData();
		
		file = new CoverageFile();
		file.getData();

	}

}
