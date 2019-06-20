package com.compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
	
	private String name;
	private String designation;
	List<Teacher> subordinates;
	
	public Teacher(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
		subordinates = new ArrayList<>();
	}
	
	public void addTeacher(Teacher teacher){
		subordinates.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher){
		subordinates.remove(teacher);
	}
	
	public List<Teacher> getSubordinates(){
		return subordinates;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", designation=" + designation + "]";
	}

}
