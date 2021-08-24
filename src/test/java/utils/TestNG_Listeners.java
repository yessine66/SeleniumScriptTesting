package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;

public class TestNG_Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("\n ***************Test Started :"+result.getName());
		
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		System.out.println("\n ***************Test Sucessful :"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		
		System.out.println("\n***********************Test Failed : "+result.getName());
		
		/*System.out.println("\n ***************Test failed "+ ExcelDateProvider.driver.getCurrentUrl() +" Loggin out:"+result.getName());
		
		//ExcelDateProvider.driver.navigate().to("https://support.tomtom.com/app/contact/") ;
		
		ExcelDateProvider.driver.findElement(By.id("welcome")).click();
		ExcelDateProvider.driver.findElement(By.linkText("Logout")).click();

		//throw new SkipException("This test is skipped");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//ExcelDateProvider.driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("\n\n*************************************d5al walle ??  " + ExcelDateProvider.driver.getCurrentUrl());
		*/
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("\n ***************Test Skipped :"+result.getName());
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		System.out.println("\n ***************Test Completed :"+context.getName());
		
	}

}
