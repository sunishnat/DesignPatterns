package com.filterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class TestFilter {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		List<String> criteria = new ArrayList<>();
		
		employees.add(new Employee(101, "Charles", "Admin", "Manager", "Analysis"));
		employees.add(new Employee(102, "Eric", "Marketing", "Manager", "Sales"));
		employees.add(new Employee(103, "Raven", "Sales", "Manager", "Sales"));
		employees.add(new Employee(104, "Hank", "IT", "Developer", "Java"));
		employees.add(new Employee(105, "Moira", "Admin", "Lead", "Design"));
		employees.add(new Employee(106, "Logan", "Marketing", "Associate", "Advertising"));
		
		Criteria department = new DeptCriteria();
		Criteria role = new RoleCriteria();
		Criteria skill = new SkillCriteria();
		Criteria departmentRole = new AndCriteria(department, role);
		Criteria departmentOrSkill = new OrCriteria(department, skill);
		
		System.out.println("Marketing:");
		criteria.add("Marketing");
		printEmployees(department.getEmployeesByCriteria(employees, criteria));
		criteria.clear();
		
		System.out.println("Manager:");
		criteria.add("Manager");
		printEmployees(role.getEmployeesByCriteria(employees, criteria));
		criteria.clear();
		
		System.out.println("Sales:");
		criteria.add("Sales");
		printEmployees(skill.getEmployeesByCriteria(employees, criteria));
		criteria.clear();
		
		System.out.println("Marketing Manager:");
		criteria.add("Marketing");
		criteria.add("Manager");
		printEmployees(departmentRole.getEmployeesByCriteria(employees, criteria));
		criteria.clear();
		
		System.out.println("Marketing Or Sales:");
		criteria.add("Marketing");
		criteria.add("Sales");
		printEmployees(departmentOrSkill.getEmployeesByCriteria(employees, criteria));
		criteria.clear();

	}
	
	public static void printEmployees(List<Employee> employees){
		for(Employee employee : employees){
			System.out.println(employee);
		}
	}
}
