package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() {
		
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("Facebook");
		searchPageObj.submitSearchBox();
		
		
		driver.close();
		
		
	}

}
