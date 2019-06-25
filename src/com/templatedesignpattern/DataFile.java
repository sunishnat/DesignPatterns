package com.templatedesignpattern;

public abstract class DataFile {
	
	abstract void openFile();
	abstract void fetchData();
	abstract void closeFile();
	
	public final void getData(){
		openFile();
		fetchData();
		closeFile();
	}

}
