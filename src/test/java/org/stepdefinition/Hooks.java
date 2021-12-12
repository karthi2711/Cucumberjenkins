package org.stepdefinition;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;

public class Hooks extends BaseClass{
	
	
	@io.cucumber.java.Before
	public void Before() {
		System.out.println("Before Scenario");
		chromeBrowser();
		maxwindow();
		impwait();

	}

	@io.cucumber.java.After
	public void After(Scenario S) {
		
		if (S.isFailed()) {
			
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
			S.embed(screen, "image/png");
			
		}
		
		closeBrowser();
		
		System.out.println("After Scenario");
		

	}
}
