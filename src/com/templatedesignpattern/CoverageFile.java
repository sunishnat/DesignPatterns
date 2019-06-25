package com.templatedesignpattern;

public class CoverageFile extends DataFile {

	@Override
	void openFile() {
		System.out.println("Opening Coverage File");
	}

	@Override
	void fetchData() {
		System.out.println("Fetching data from Coverage File");
	}

	@Override
	void closeFile() {
		System.out.println("Closing Coverage File");
	}

}
