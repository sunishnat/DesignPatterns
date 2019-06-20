package com.filterdesignpattern;

import java.util.List;

public interface Criteria {
	
	public List<Employee> getEmployeesByCriteria(List<Employee> employees, List<String> criteria);

}
