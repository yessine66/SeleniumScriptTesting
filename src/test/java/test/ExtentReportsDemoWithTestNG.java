package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {
	
	WebDriver driver=null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	
	
	@BeforeSuite
	public void setUp(){
		
        // start reporters
         htmlReporter = new ExtentHtmlReporter("extent.html");
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
	}
	
	
	
	@BeforeTest
	public void setUpTest() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	
	
	
	@Test(priority=2)
	public void test1() throws Exception {
		
		
		
		
	//	driver.findElement(By.name("q")).sendKeys("Facebook");
		
	//	driver.findElement(By.name("q")).submit();
		
		
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest1", "Sample description");
		
        
        driver.get("https://google.com");
        test.pass("Navigated to google.com");
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
		
	}
	
	
	@Test(priority=1)
	public void test2() throws Exception {
		 // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest2", "Sample description");
		
        
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
        
		
	}
	
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Seccessfully");
	}
	
	
	@AfterSuite
	public void tearDown() {
		
		//driver.close();
		
        // calling flush writes everything to the log file
        extent.flush();
		
	}

}
