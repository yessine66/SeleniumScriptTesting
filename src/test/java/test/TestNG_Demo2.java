package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver = null;

	
	@BeforeTest
	public void setUpTest() {
		
		//set up browser
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
		
	}
	
	
	@Test
	public  void googleSearch2() {
		
		

		//got to google.com
		driver.get("https://google.com");
		
		//enter text in search textBox
		driver.findElement(By.name("q")).sendKeys("Tunisie Telecom");
		
		//Submit Text Search by Enter
		driver.findElement(By.name("q")).submit();
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();

		
	}
	
	
	@Test
	public  void googleSearch3() {
		
		

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
		driver.quit();
		System.out.println(" \n\n success ");
		
	}

}
