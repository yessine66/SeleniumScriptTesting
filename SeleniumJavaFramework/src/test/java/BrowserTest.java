import java.util.*;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("test1");
		
	WebElement textBox = driver.findElement(By.name("q"));
		
		textBox.sendKeys("Yessine ya ta7foun");
	
		List<WebElement> listOfInputElements =   driver.findElements(By.xpath("//input"));
		
		driver.findElement(By.name("q")).submit();

		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		
		
		alt.wait();
		
		
		
		System.out.println("\n\n number of elements  "+ listOfInputElements.size());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		//driver.quit();
		
	}
	
}
