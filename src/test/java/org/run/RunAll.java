package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\FeatureFiles2",glue="org.stepdefinition",
dryRun=false,monochrome=true,strict=true)

public class RunAll {
	
	@AfterClass
	public static void aftcls() {
		JvmReport.generateJVMReport("C:\\Users\\karthikeyan\\eclipse-workspace\\Cucumber\\AllReports\\JsonReports\\fb.json");

	}

}
