package com.prototypedesignpattern;

import java.util.Hashtable;

public class ProjectCache {
	
	private static Hashtable<String, Project> projectCache = new Hashtable<>();
	
	public static Project getAssociate(String type){
		Project associate = projectCache.get(type);
		return (Project) associate.clone();
	}
	
	public static void loadCache(){
		Project analyst = new Analyst();
		analyst.setAssociate("analyst");
		projectCache.put(analyst.getAssociate(), analyst);
		
		Project developer = new Developer();
		developer.setAssociate("developer");
		projectCache.put(developer.getAssociate(), developer);
		
		Project tester = new Tester();
		tester.setAssociate("tester");
		projectCache.put(tester.getAssociate(), tester);
		
		Project support = new Support();
		support.setAssociate("support");
		projectCache.put(support.getAssociate(), support);
	}

}
