package org.locator;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends BaseClass {
	
	public Loginpojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement txtemail;
	
	@FindBy(name="pass")
	private WebElement txtpass;
	
	@FindBy(name="login")
	private WebElement btnlogin;
	
	

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
}
