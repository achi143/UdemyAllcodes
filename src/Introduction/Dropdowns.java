package Introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\ASHRITH\\workspace\\Oxygen Workspace\\UdemyCources\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com");
		
		Thread.sleep(2000L);
		
		Select s = new Select(driver.findElement(By.id("ssdv")));
		
		s.selectByIndex(5);
		
		//driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		
		
		/*driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();	
		
		// when we want to repeat the code for the many times 
				// we should use loop 
		int i =1;
	
		while(i<5)	{
			
			driver.findElement(By.xpath());
			i++;
		}*/
	}
}
