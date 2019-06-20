package com.filterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class SkillCriteria implements Criteria {

	@Override
	public List<Employee> getEmployeesByCriteria(List<Employee> employees, List<String> criteria) {
		List<Employee> skillEmployees = new ArrayList<>();
		
		for(Employee employee : employees){
			if(employee.getSkill().equalsIgnoreCase(criteria.get(0))){
				skillEmployees.add(employee);
			}
		}
		
		return skillEmployees;
	}

}
