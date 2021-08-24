package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		
		//set up browser
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//got to google.com
		driver.get("https://google.com");
		
		//enter text in search textBox
		driver.findElement(By.name("q")).sendKeys("Tunisie Telecom");
		
		//Submit Text Search by Enter
		driver.findElement(By.name("q")).submit();
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//close browser
		driver.close();
		
		System.out.println(" \n\n success ");

		
	}

}
