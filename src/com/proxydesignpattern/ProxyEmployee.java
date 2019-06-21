package com.proxydesignpattern;

public class ProxyEmployee implements Employee {
	
	private RealEmployee realEmployee;
	private int eid;

	public ProxyEmployee(int eid) {
		this.eid = eid;
	}

	@Override
	public void getEmployee() {
		if(realEmployee == null){
			realEmployee = new RealEmployee(eid);
		}
		realEmployee.getEmployee();

	}

}
