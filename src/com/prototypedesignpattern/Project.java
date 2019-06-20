package com.prototypedesignpattern;

public abstract class Project implements Cloneable {
	
	private String associate;
	
	abstract void getWork();
	
	public String getAssociate() {
		return associate;
	}
	public void setAssociate(String associate) {
		this.associate = associate;
	}
	
	public Object clone(){
		
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return clone;
		
	}

}
