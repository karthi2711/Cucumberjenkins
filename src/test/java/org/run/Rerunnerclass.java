package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	@RunWith(Cucumber.class)

	@CucumberOptions(features="@Rerun\\fb2.txt",glue="org.stepdefinition",
	dryRun=false,monochrome=true,strict=true,plugin= {
			"rerun:C:\\Users\\karthikeyan\\eclipse-workspace\\Cucumber\\Rerun\\fb2.txt"})

	public class Rerunnerclass {
		
		@AfterClass
		public static void aftcls() {
			JvmReport.generateJVMReport("C:\\Users\\karthikeyan\\eclipse-workspace\\Cucumber\\AllReports\\JsonReports\\fb.json");

		}

}
