package com.filterdesignpattern;

public class Employee {
	
	private int eid;
	private String ename;
	private String dept;
	private String role;
	private String skill;
	
	public Employee(int eid, String ename, String dept, String role, String skill) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.role = role;
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", role=" + role + ", skill=" + skill
				+ "]";
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

}
