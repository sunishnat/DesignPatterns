package com.adapterdesignpattern;

public class DesignLab implements DesignDepartment {

	DepartmentAdapter deptAdapter;
	
	@Override
	public void buildDesign(String application, String applicationType) {
		if(applicationType.equalsIgnoreCase("design")){
			System.out.println("Building design for " + application);
		}
		else if(applicationType.equalsIgnoreCase("webapplication") 
				|| applicationType.equalsIgnoreCase("mobileapplication")){
			deptAdapter = new DepartmentAdapter(applicationType);
			deptAdapter.buildDesign(application, applicationType);
		}
		else{
			System.out.println("We don't do that here " + applicationType);
		}

	}

}
