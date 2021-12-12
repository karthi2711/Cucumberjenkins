package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	static Actions a;
	
	static Robot r;



	public static void chromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void closeBrowser() {
		driver.close();

	}
	
	public static void impwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void maxwindow() {
		driver.manage().window().maximize();

	}

	public static String pageTitle() {
		String titlename = driver.getTitle();
		return titlename;

	}

	public static String pageurl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static void btnclick(WebElement element) {

		element.click();

	}

	public static void fillTextBox(WebElement ele, String value) {

		ele.sendKeys(value);

	}

	public static void clickdouble(WebElement ele) {
		a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public void draganddrop(WebElement source, WebElement desc) {
		a = new Actions(driver);
		a.dragAndDrop(source, desc);

	}

	public static void copy() throws AWTException {

		r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

		

	}

	public static void paste() throws AWTException {

		r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);


		
	}
	
	public static void takesnap(String picname) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File ft = tk.getScreenshotAs(OutputType.FILE);
		File de=new File("C:\\Users\\karthikeyan\\eclipse-workspace\\MavenClass\\Screenshots\\"+picname+".png");
		FileUtils.copyFile(ft, de);
		
		

	}
	
	public static void getDateandTime() {
		Date d=new Date();
		System.out.println(d);
	}
	
	
	
	

}
