package com.proxydesignpattern;

public class RealEmployee implements Employee {
	
	private int eid;

	public RealEmployee(int eid) {
		this.eid = eid;
		fetchFromDb(eid);
	}

	public void fetchFromDb(int eid) {
		System.out.println("Fetching details from DB for employee " + eid );
	}

	@Override
	public void getEmployee() {
		System.out.println("Loading details for employee " + eid);
	}

}
