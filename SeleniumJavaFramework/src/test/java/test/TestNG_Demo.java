package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browserName=null;

	
	@BeforeTest
	public void setUpTest() {
		
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("firefox")) {
			//set up browser
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		

		
		
	}
	
	
	@Test
	public  void googleSearch() {
		
		

		//got to google.com
		driver.get("https://google.com");
		
		//enter text in search textBox
		driver.findElement(By.name("q")).sendKeys("Tunisie Telecom");
		
		//Submit Text Search by Enter
		driver.findElement(By.name("q")).submit();
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();

		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		
		//close browser
		driver.close();
		//driver.quit();
		System.out.println(" \n\n success ");
		
		PropertiesFile.setProperties();
		
	}

}
