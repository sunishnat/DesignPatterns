package com.templatedesignpattern;

public class CollectionFile extends DataFile {

	@Override
	void openFile() {
		System.out.println("Opening Collection File");
	}

	@Override
	void fetchData() {
		System.out.println("Fetching data from Collection File");
	}

	@Override
	void closeFile() {
		System.out.println("Closing Collection File");
	}

}
