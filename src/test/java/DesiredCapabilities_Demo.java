import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//desired capability nestaamlouha kin7ebou nbadlou f config taa browser mathalan telemini popus wala zoom wala desactivi des protocol ...
		
		String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("ignoreProtectedModeSttings", true);
		
		
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(caps);
		
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Battelfield");
		driver.findElement(By.name("q")).submit();
		
		driver.close();
		//driver.quit();
		
	}

}
