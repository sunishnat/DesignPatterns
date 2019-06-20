package com.compositedesignpattern;

public class TestComposite {

	public static void main(String[] args) {
		Teacher principal = new Teacher("Charles", "Principal");
		
		Teacher headTheory = new Teacher("Hank", "Head of Theory");
		Teacher headPractical = new Teacher("Raven", "Head of Practical");
		
		Teacher theoryTeacher1 = new Teacher("Ororo", "Theory Teacher");
		Teacher theoryTeacher2 = new Teacher("Peter", "Theory Teacher");
		
		Teacher practicalTeacher1 = new Teacher("Scott", "Practical Teacher");
		Teacher practicalTeacher2 = new Teacher("Jean", "Practical Teacher");
		Teacher practicalTeacher3 = new Teacher("Kurt", "Practical Teacher");
		
		principal.addTeacher(headTheory);
		principal.addTeacher(headPractical);
		
		headTheory.addTeacher(theoryTeacher1);
		headTheory.addTeacher(theoryTeacher2);
		
		headPractical.addTeacher(practicalTeacher1);
		headPractical.addTeacher(practicalTeacher2);
		headPractical.addTeacher(practicalTeacher3);
		
		System.out.println(principal);
		
		for(Teacher head : principal.getSubordinates()){
			System.out.println(head);
			
			for(Teacher teacher : head.getSubordinates()){
				System.out.println(teacher);
			}
		}

	}

}
