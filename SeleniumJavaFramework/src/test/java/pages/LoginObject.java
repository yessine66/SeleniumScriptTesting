package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginObject {
	
	WebDriver driver=null;
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By buttonLogin = By.id("btnLogin");
	By buttonWelcome = By.id("welcome");
	By buttonLogOut = By.linkText("Logout");
	
	
	public LoginObject(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void setTextUsername(String input) {
		
		driver.findElement(username).sendKeys(input);
		
	}
	
	public void setTextPassword(String input) {
		
		driver.findElement(password).sendKeys(input);
		
	}

	
	public void clickSearchButtonLogin() {
		
		driver.findElement(buttonLogin).click();
		
	}
	
	public void clickSearchButtonWelcome() {
		
		driver.findElement(buttonWelcome).click();
		
	}
	
	public void clickSearchButtonLogOut() {
		
		driver.findElement(buttonLogOut).click();
		
	}


}
