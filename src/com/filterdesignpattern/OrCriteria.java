package com.filterdesignpattern;

import java.util.List;

public class OrCriteria implements Criteria {
	
	private Criteria firstCriteria;
	private Criteria secondCriteria;

	public OrCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Employee> getEmployeesByCriteria(List<Employee> employees, List<String> criteria) {
		List<Employee> firstCriteriaEmployees = firstCriteria.getEmployeesByCriteria(employees, criteria);
		criteria.remove(0);
		List<Employee> secondCriteriaEmployees = secondCriteria.getEmployeesByCriteria(employees, criteria);
		
		for(Employee employee : secondCriteriaEmployees){
			if(!firstCriteriaEmployees.contains(employee)){
				firstCriteriaEmployees.add(employee);
			}
		}
		return firstCriteriaEmployees;
	}

}
