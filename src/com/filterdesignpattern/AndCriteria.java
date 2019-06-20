package com.filterdesignpattern;

import java.util.List;

public class AndCriteria implements Criteria {
	
	private Criteria firstCriteria;
	private Criteria secondCriteria;

	public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Employee> getEmployeesByCriteria(List<Employee> employees, List<String> criteria) {
		List<Employee> firstCriteriaEmployees = firstCriteria.getEmployeesByCriteria(employees, criteria);
		criteria.remove(0);
		
		return secondCriteria.getEmployeesByCriteria(firstCriteriaEmployees, criteria);
	}

}
