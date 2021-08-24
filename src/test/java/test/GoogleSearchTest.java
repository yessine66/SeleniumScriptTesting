package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		
		//set up browser
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		//got to google.com
		driver.get("https://google.com");
		
		//enter text in search textBox and search it by pressing enter ans dubmitting it 
		//driver.findElement(By.name("q")).sendKeys("Tunisie Telecom");
		
		GoogleSearchPage.textBox_search(driver).sendKeys("Tunisie Telecom",Keys.RETURN);
		

		
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
