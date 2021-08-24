package listeners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {

	
	@Test
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
		
		
		String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("test1");
		
	WebElement textBox = driver.findElement(By.name("qqqq"));
		
		textBox.sendKeys("Yessine ya ta7foun");
		
		driver.close();
		
		

	}
	
	
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped ");
	}
	

	
}
