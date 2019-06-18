package com.adapterdesignpattern;

public class DepartmentAdapter implements DesignDepartment {

	TechnicalDepartment techdepartment;
	
	public DepartmentAdapter(String applicationType){
		if(applicationType.equalsIgnoreCase("webapplication")){
			techdepartment = new WebApplicationDepartment();
		}
		else if(applicationType.equalsIgnoreCase("mobileapplication")){
			techdepartment = new MobileApplicationDepartment();
		}
	}

	@Override
	public void buildDesign(String application, String applicationType) {
		if(applicationType.equalsIgnoreCase("webapplication")){
			techdepartment.developWebApplication(application);
		}
		else if(applicationType.equalsIgnoreCase("mobileapplication")){
			techdepartment.developMobileApplication(application);
		}
		
	}

}
