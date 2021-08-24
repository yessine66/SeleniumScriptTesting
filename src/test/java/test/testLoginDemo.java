package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testLoginDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		
		driver.findElement(By.id("identifierId")).sendKeys("yessine.fraj@esprit.tn");
		
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.id("identifierId")).submit();
		
		
		driver.findElement(By.name("password")).sendKeys("google3.0");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}
	
}
