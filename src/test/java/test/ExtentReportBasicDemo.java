package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.GoogleSearchPage;

public class ExtentReportBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One" , "this is a test to validate google functionality");


        
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com");
		test1.pass("Navigated to Google.com;");
		
		
		
		System.out.println("\n\n\naaaaaaaaaaaaaa*************************************");
		driver.findElement(By.name("q")).sendKeys("Facebook");
		test1.pass("typing in Search Box ");
		
		driver.findElement(By.name("q")).submit();
		test1.pass("Submitting what has been written in text Box");
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	//	driver.quit();
		test1.pass("Close The browser");
		
		test1.info("Test Completed");
		
		
		
		
		
		
		///////////////////////////////////////
		
		
		  // creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test Two" , "this is a test to validate google functionality2");


        
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		
		
		
		test2.log(Status.INFO, "Starting Test Case 2");
		driver.get("https://google.com");
		test2.pass("Navigated to Google.com 2");
		
		
		System.out.println("\n\n\naaaaaaaaaaaaaa*************************************");
		driver.findElement(By.name("q")).sendKeys("Facebook Gaming");
		test2.pass("typing in Search Box 2 ");
		
		driver.findElement(By.name("q")).submit();
		test2.fail("Submitting what has been written in text Box 2");
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
	//	driver.quit();
		test2.pass("Close The browser 2");
		
		test2.info("Test Completed 2");
		
		
		
		//////////////////////////////////////
		
		//this last step to show all the report ma8ir hevi manchouf chy
		extent.flush();
		
		
        
	}

}
