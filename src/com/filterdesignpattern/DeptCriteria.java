package com.filterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class DeptCriteria implements Criteria {

	@Override
	public List<Employee> getEmployeesByCriteria(List<Employee> employees, List<String> criteria) {
		List<Employee> deptEmployees = new ArrayList<>();
		
		for(Employee employee : employees){
			if(employee.getDept().equalsIgnoreCase(criteria.get(0))){
				deptEmployees.add(employee);
			}
		}
		
		return deptEmployees;
	}

}
