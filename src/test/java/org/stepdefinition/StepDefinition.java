package org.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.helper.BaseClass;
import org.locator.Forgotloginpojo;
import org.locator.Loginpojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {
	
	
	Loginpojo lo;
	Forgotloginpojo fo;
	
	@Given("User have to click forgotten password button")
	public void user_have_to_click_forgotten_password_button() {
		 fo=new Forgotloginpojo();
		WebElement frgbtn = fo.getFrgbtn();
		btnclick(frgbtn);
	    
	}
	@When("User have to enter email or phoneno")
	public void user_have_to_enter_email_or_phoneno() {
		WebElement mobileno = fo.getMobileno();
		fillTextBox(mobileno, "123456789");
	    
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
	    WebElement submitbt = fo.getSubmitbt();
	    btnclick(submitbt);
	}
	
	
	@Given("User have to enter facebook login through chrome browser")
public void user_have_to_enter_facebook_login_through_chrome_browser() {
		
		
		
		launchurl("https://www.facebook.com/");
		
		
}
	@When("User have to enter invalid email and invalid password")
	public void user_have_to_enter_invalid_email_and_invalid_password() {
		lo=new Loginpojo();
		WebElement txtemail = lo.getTxtemail();
		fillTextBox(txtemail, "selenium");
		WebElement txtpass = lo.getTxtpass();
	    fillTextBox(txtpass, "123456");
	}


@When("User have to enter valid email and invalid password")
public void user_have_to_enter_valid_email_and_invalid_password() {
	
	 lo=new Loginpojo();
	WebElement txtemail = lo.getTxtemail();
	fillTextBox(txtemail, "karthieie2@gmail.com");
	WebElement txtpass = lo.getTxtpass();
    fillTextBox(txtpass, "123456");
}

@When("User have to enter valid Email and invalid password")
public void user_have_to_enter_valid_Email_and_invalid_password(io.cucumber.datatable.DataTable d) {
   Map<String,String> map = d.asMap(String.class, String.class);
   
   String email = map.get("email");
   String password = map.get("password");
    
    lo=new Loginpojo();
	WebElement txtemail = lo.getTxtemail();
	fillTextBox(txtemail, email);
	WebElement txtpass = lo.getTxtpass();
    fillTextBox(txtpass, password);
}
@When("User have to enter invalid emailadd and invalid password")
public void user_have_to_enter_invalid_emailadd_and_invalid_password(io.cucumber.datatable.DataTable d) {
	List<Map<String, String>> map1 = d.asMaps(String.class, String.class);
	String email = map1.get(0).get("username");
	String pass = map1.get(0).get("password");
	
	lo=new Loginpojo();
	WebElement txtemail = lo.getTxtemail();
	fillTextBox(txtemail, email);
	WebElement txtpass = lo.getTxtpass();
    fillTextBox(txtpass, pass);
   
}


@When("User have to click login button")
public void user_have_to_click_login_button() throws InterruptedException {
	
	WebElement btnlogin = lo.getBtnlogin();
	btnclick(btnlogin);
	Thread.sleep(3000);
    
}

@Then("User have to reach invaild credentials page")
public void user_have_to_reach_invaild_credentials_page() {
   
	String currentUrl = driver.getCurrentUrl();
	if (currentUrl.contains("privacy_mutation_token")) {
		
		System.out.println("User is in invalid credential page");
	}
		else {
			System.out.println("User is in valid credential page");
		}
		
	}
}



