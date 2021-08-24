package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import config.PropertiesFile;
import pages.LoginObject;

public class ExcelDateProvider {


	static WebDriver driver = null;
	
	static LoginObject login = null;
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	
	@BeforeSuite
	public void setUp(){
		
        // start reporters
         htmlReporter = new ExtentHtmlReporter("LoginReport.html");
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
	}
	
	@BeforeTest
	public void setUpTest() {
		

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
			 login = new LoginObject(driver);

	}
	
	
	

	@Test
	public void testLoginIncorrect() throws InterruptedException {
		
		ExtentTest test = extent.createTest("Test 1 ", "---Testing Login With invalid username or password");
		
		System.out.println("\nTest Login Incorrect ---------------------------");
		
		//driver.findElement(By.id("user_email_login")).clear();
		//driver.findElement(By.id("user_password")).clear();
		
		//driver.findElement(By.id("txtUsername")).sendKeys("test");
		login.setTextUsername("test");
		test.pass("Saisir Username");
		Thread.sleep(1500);
		//driver.findElement(By.id("txtPassword")).sendKeys("test");
		login.setTextPassword("test");
		test.pass("Saisir Password");
		Thread.sleep(1500);
		
		//driver.findElement(By.id("btnLogin")).click();
		login.clickSearchButtonLogin();
		test.pass("clicked button login");
		Thread.sleep(3000);
		
	}
	

	
	@Test
	public void testLoginCorrect() throws InterruptedException {
		
		
		ExtentTest test = extent.createTest("Test 2 ", "+++Testing Login With Valid username and password");
		
		System.out.println("\nTest Login correct ++++++++++++++++++++++++++++");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		login.setTextUsername("Admin");
		test.pass("Saisir Username");
		Thread.sleep(1500);
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		login.setTextPassword("admin123");
		test.pass("Saisir Password");
		Thread.sleep(1500);
		//driver.findElement(By.id("btnLogin")).click();
		login.clickSearchButtonLogin();
		test.pass("clicked button login");
		Thread.sleep(1500);
		
		System.out.println("\n\n*******************CURRENT URL "+driver.getCurrentUrl());
		
		//driver.findElement(By.id("welcome")).click();
		login.clickSearchButtonWelcome();
		test.pass("clicked button welcome");
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Logout")).click();
		login.clickSearchButtonLogOut();
		test.pass("clicked button logout");
		Thread.sleep(2000);
		
		

	}
	
	@AfterTest
	public void tearDownTest() {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//close browser
		driver.close();
		//driver.quit();
		System.out.println(" \n\n success ");
		
	
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		
		//driver.close();
		
        // calling flush writes everything to the log file
        extent.flush();
		
	}
	
	
	
	/*
	
	@Test(dataProvider="test1data")
	public void test1(String username , String password) throws InterruptedException {
		System.out.println(username+"  "+password);
		
		
		System.out.println();
		
		//driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.id("btnLogin")).click();
		
		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/auth/login")) {
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			
			driver.findElement(By.id("btnLogin")).click();
			
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
		
		Thread.sleep(3000);
		
	}
	*/
	
	/*
	@Test(dataProvider="test1data")
	public void test1(String username , String password) throws InterruptedException {
		System.out.println(username+"  "+password);
		
		
		//System.out.println("\nCurrent URL : "+driver.getCurrentUrl());
		
		//driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.id("btnLogin")).click();
		
	
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			
			driver.findElement(By.id("btnLogin")).click();
			
	
		
		
		
		
		Thread.sleep(3000);
		
	}
	
*/
	
	
	
	
/*	@DataProvider(name="test1data")
	public static Object getDate() {
		
		Object data[][]  = testData(System.getProperty("user.dir")+"\\excel\\data.xlsx", "Sheet1");
		
		ExcelUtils excel = new ExcelUtils(System.getProperty("user.dir")+"\\excel\\data.xlsx", "Sheet1");
		
		
		
		return data;
	}
	*/

	
	
	public static Object[][] testData(String excelPath , String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int i,j,x,y;
		x=excel.getRowCount();
		y=excel.getColCount();
		Object data[][]=new Object[x-1][y];
		
		
		for( i=1;i<x;i++) {
			for( j=0;j<y;j++) {
				System.out.print(excel.getCellDateString(i, j));
				System.out.print("|");
				data[i-1][j]=excel.getCellDateString(i, j);	
				
			}
			System.out.println();
		}
		
		
		
		return data;
		
	}
	
	
}
