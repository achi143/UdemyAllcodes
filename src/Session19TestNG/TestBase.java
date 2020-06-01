package Session19TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase 
{
	
	WebDriver driver;
	
	@Test
	public void login() throws IOException
	{
		
		Properties pro = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\src\\Session19TestNG\\Datadriven.properties");
		
		pro.load(fis);
		
		if(pro.getProperty("browser").equals("firefox"))
		{
			System.setProperty("Webdriver.firefox.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
		}
		
		else if(pro.getProperty("browser").equals("chrome"))
		
		{
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		
		driver.get(pro.getProperty("url"));	
		
	}

}
