package com.filterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class RoleCriteria implements Criteria {

	@Override
	public List<Employee> getEmployeesByCriteria(List<Employee> employees, List<String> criteria) {
		List<Employee> roleEmployees = new ArrayList<>();
		
		for(Employee employee : employees){
			if(employee.getRole().equalsIgnoreCase(criteria.get(0))){
				roleEmployees.add(employee);
			}
		}
		
		return roleEmployees;
	}

}
