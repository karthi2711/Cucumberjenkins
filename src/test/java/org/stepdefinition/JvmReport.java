package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	
	public static void generateJVMReport(String jsonpath) {
		
		File f=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\Cucumber\\AllReports\\JVMReports");
		
		Configuration a=new Configuration(f, "facebook application");
		
		a.addClassifications("platform", "windows");
		a.addClassifications("sprint", "123");
		
		List<String> s=new ArrayList<String>();
		s.add(jsonpath);
		
		ReportBuilder R=new ReportBuilder(s, a);
		R.generateReports();

	}

}
