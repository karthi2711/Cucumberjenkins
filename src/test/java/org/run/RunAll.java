package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\FeatureFiles2",glue="org.stepdefinition",
dryRun=false,monochrome=true,strict=true,plugin= {"pretty",
		"html:C:\\Users\\karthikeyan\\eclipse-workspace\\Cucumbejen\\AllReports\\htmlReports",
		"json:C:\\Users\\karthikeyan\\eclipse-workspace\\Cucumbejen\\AllReports\\JsonReports\\fb.json",
		"junit:C:\\Users\\karthikeyan\\eclipse-workspace\\Cucumbejen\\AllReports\\JunitReports\\fb1.xml"})

public class RunAll {
	
	
}
