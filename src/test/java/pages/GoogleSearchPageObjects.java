package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver=null;
	
	By textBoxSearch = By.name("q");
	
	By buttonSearch = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void setTextInSearchBox(String input) {
		
		driver.findElement(textBoxSearch).sendKeys(input);
		
	}
	
	public void submitSearchBox() {
		
		driver.findElement(textBoxSearch).submit();
		
	}
	
	public void clickSearchButton() {
		
		driver.findElement(buttonSearch).sendKeys(Keys.RETURN);
		
	}

}
