package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {

	private static Properties prop ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getProperties();
		setProperties();
		getProperties();

	}
	
	public static void getProperties() {
		
		try {
			 prop = new Properties();
			InputStream input = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			TestNG_Demo.browserName=browser;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\nException getProperties()");
			System.out.println("\n Exception : "+ e.getMessage()+"\nCaused by : "+e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void setProperties() {
		
		try {
			
			OutputStream output = new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\nException setProperties()");
			System.out.println("\n Exception : "+ e.getMessage()+"\nCaused by : "+e.getCause());
			e.printStackTrace();
		}
		
	}

}
