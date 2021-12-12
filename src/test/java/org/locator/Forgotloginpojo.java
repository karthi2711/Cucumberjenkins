package org.locator;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotloginpojo extends BaseClass{
	
	public Forgotloginpojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
    private WebElement frgbtn;

	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
    private WebElement mobileno;
	
	@FindBy(xpath="//button[@type='submit']")
    private WebElement submitbt;
	
	public WebElement getFrgbtn() {
		return frgbtn;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getSubmitbt() {
		return submitbt;
	}



}





